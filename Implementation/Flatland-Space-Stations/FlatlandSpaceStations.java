import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of cities
		int m = in.nextInt(); // number of space stations
		long a[] = new long[n];

		for (int i = 0; i < m; i++) {
			int d = in.nextInt();
			a[d] = 1;
		}

		long one[] = new long[n];
		long onec = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				onec = i;
			}

			if (onec != -1) {
				one[i] = i - onec;
			} else if (onec == -1) {
				one[i] = -1;
			}
		}

		long sec[] = new long[n];
		long secc = -1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == 1) {
				secc = i;
			}

			if (secc != -1) {
				sec[i] = secc - i;
			} else if (secc == -1) {
				sec[i] = -1;
			}
		}

		long f = 0;
		long d[] = new long[n];
		for (int i = 0; i < d.length; i++) {
			if (one[i] == -1) {
				d[i] = sec[i];
			} else if (sec[i] == -1) {
				d[i] = one[i];
			} else {

				d[i] = Math.min(one[i], sec[i]);
			}
			
			if (d[i] > f) {
				f = d[i];
			}
		}
		System.out.println(f);
	}
}
