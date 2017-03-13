import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		char t[][] = new char[n][n];

		for (int i = 0; i < n; i++) {
			String d = in.next();
			for (int j = 0; j < n; j++) {
				t[i][j] = d.charAt(j);
			}
		}

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if (isValid(i, j, t)) {
					t[i][j] = 'X';
				}
			}
		}

		for (int i = 0; i < t.length; i++) {
			
			for (int j = 0; j < t.length; j++) {
				System.out.print(t[i][j]);
			}
            System.out.println();
		}
	}

	private static boolean isValid(int i, int j, char[][] t) {
		int k = Integer.valueOf(t[i][j]);
		int k1 = Integer.valueOf(t[i + 1][j]);
		int k2 = Integer.valueOf(t[i - 1][j]);
		int k3 = Integer.valueOf(t[i][j + 1]);
		int k4 = Integer.valueOf(t[i][j - 1]);

		if (k1 < k && k2 < k && k3 < k && k4 < k) {
			return true;
		}
		return false;
	}
}
