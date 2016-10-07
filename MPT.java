import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		long[] array = new long[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextLong();
		}

		long P = -1;
		long a = 0;
		long b = 0;
		long c = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (isDegenerate(array[i], array[j], array[k]) == true) {
						System.out.printf("%d, %d, %d is degenerative", array[i], array[j], array[k]);
						System.out.println();
					}

					else {
						long tempP = array[i] + array[j] + array[k];
						if (tempP > P) {
							P = tempP;
							a = array[i];
							b = array[j];
							c = array[k];
							System.out.printf("%d, %d, %d is OK", a, b, c);
						}
					}
				}
			}
		}

		if (a > b) {
			long k = a;
			a = b;
			b = k;
		}

		if (b > c) {
			long k = b;
			b = c;
			c = k;
		}

		if (P == -1) {
			System.out.println("-1");
		} else {
			System.out.printf("%d %d %d", a, b, c);
		}

	}

	private static boolean isDegenerate(long a, long b, long c) {
		if (a + b <= c || b + c <= a || a + c <= b) {
			return true;
		}

		return false;
	}

}
