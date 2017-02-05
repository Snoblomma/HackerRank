import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();// test cases

		for (int i = 0; i < T; i++) {
			int n = in.nextInt(); // size of array
			int A[] = new int[n];

			for (int j = 0; j < A.length; j++) {
				A[j] = in.nextInt();
			}
			System.out.println(isSum(A));
		}

	}

	private static String isSum(int[] a) {
		if (a.length == 1) {
			return "YES";
		} else if (a.length == 2) {
			return "NO";
		}  else if (a.length == 3) {
			if (a[0] == a[a.length - 1]) {
				return "YES";
			} else {
				return "NO";
			}
		} else {
			int left = 0;
			int right = 0;
			int s = a.length / 2;

			for (int i = 0; i <= s - 1; i++) {
				left = left + a[i];
			}
			for (int i = s + 1; i <= a.length-1; i++) {
				right = right + a[i];
			}
			System.err.println(left + " " + right);

			if (left == right) {
				return "YES";
			} else if (left < right) {
				while (left < right) {
					left += a[s];
					right -= a[s + 1];
					s++;
					if (left == right) {
						return "YES";
					} else if (left > right) {
						return "NO";
					}
				}
			} else if (left > right) {
				
				while (left > right) {
					left -= a[s-1];
					right += a[s];
					s--;
					if (left == right) {
						return "YES";
					} else if (left < right) {
						return "NO";
					}
				}
				
			}

		}
		return "NO";
	}
}
