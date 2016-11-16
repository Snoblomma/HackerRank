import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt(); // number of cases

		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt(); // first n natural numbers
			int k = in.nextInt(); // needed permutaion abs(posi - i) = k

			if (k == 0) {
				print(n);
			} else {
				getPerm(n, k);
			}

		}
	}

	private static void getPerm(int n, int k) {
		if (n % 2 == 1 || n / 2 % k != 0) {
			System.out.println("-1");
		}

		else {
			for (int i = 1; i <= n; i++) {
				int q = (i + k - 1) / k;

				if (q % 2 == 1) {
					System.out.print(i + k + " ");
				} else if (q % 2 == 0) {
					if (i == n) {
						System.out.print(i - k + "\n");
					} else {
						System.out.print(i - k + " ");
					}

				}
			}
		}
	}

	private static void print(long n) {

		for (int i = 1; i <= n; i++) {
			if (i == n) {
				System.out.print(i + "\n");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
