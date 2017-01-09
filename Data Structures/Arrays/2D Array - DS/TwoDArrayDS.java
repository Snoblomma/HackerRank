import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int A[][] = new int[6][6];

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = in.nextInt();
			}
		}

		int max = -9*7;

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				int sum = 0;

				sum = A[i][j] + A[i][j+1] + A[i][j+2] + A[i + 1][j + 1] + A[i+2][j] + A[i + 2][j + 1]
						+ A[i + 2][j + 2];

				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
