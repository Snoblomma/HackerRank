import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long score[][] = new long[n][2];
		for (int i = 0; i < n; i++) {
			score[i][1] = in.nextLong();
		}

		int m = in.nextInt();
		long alice[] = new long[m];
		for (int i = 0; i < m; i++) {
			alice[i] = in.nextLong();
		}

		int c = 1;
		score[0][0] = 1;
		for (int i = 1; i < n; i++) {
			if (score[i][1] < score[i - 1][1]) {
				score[i][0] = c + 1;
				c++;
			} else if (score[i][1] == score[i - 1][1]) {
				score[i][0] = c;
			}
		}

		int r = score.length - 1;

		for (int i = 0; i < alice.length; i++) {
			long res = 0;
			for (int j = r; j >= 0; j--) {
				if (alice[i] == score[j][1]) {
					res = score[j][0];
					r = j;
					break;
				} else if (alice[i] < score[j][1]) {
					res = score[j][0] + 1;
					res = (res == 0 ? 1 : res);
					r = j;
					break;
				}
			}

			if (res == 0) {
				res = 1;
			}
			System.out.println(res);
		}
	}
}
