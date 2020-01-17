import java.util.*;

public class Solution {

  	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of chapters
		long k = in.nextInt(); // number of maximum problems on the page;
		long t[] = new long[n]; // number of problems in the i-th chapter.

		for (int i = 0; i < n; i++) {
			t[i] = in.nextInt();
		}

		System.out.println(special(n, k, t));
	}

	private static long special(int n, long k, long[] t) {
		long sp = 0;

		int size = 0;

		for (int j = 0; j < t.length; j++) {
			size += t[j];
		}

		long array[][] = new long[size][3];

		int s = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < t[i]; j++) {
				array[s][0] = i + 1;
				array[s][1] = j + 1;
				s++;
			}
		}

		int page = 1;
		array[0][2] = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i][0] > array[i - 1][0] || array[i][1] % k == 1 || k==1) {
				page++;
			}
			array[i][2] = page;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i][1] == array[i][2]) {
				sp++;
			}
		}
		return sp;
	}
}
