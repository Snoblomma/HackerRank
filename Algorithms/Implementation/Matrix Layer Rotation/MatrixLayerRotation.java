import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int M = in.nextInt();// rows
		int N = in.nextInt();// columns
		long R = in.nextLong();// rotations

		int matrix[][] = new int[M][N];
		int m[][] = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		
		long min = Math.min(M, N) / 2;
		int w = M;//current width of inner rectangle
		int h = N;//current heigth

		for (int i = 0; i < min; i++) {
			int s = (int) (R % ((w + h) * 2 - 4));
			int k = (w + h) * 2 - 4;

			int[][] a = new int[k][3];

			int curr = 0;

			for (int j = i; j < M - 1 - i; j++) {
				a[curr][0] = j;
				a[curr][1] = i;
				a[curr][2] = matrix[j][i];
				curr++;
			}

			for (int j = i; j < N - 1 - i; j++) {
				a[curr][0] = M - i - 1;
				a[curr][1] = j;
				a[curr][2] = matrix[M - i - 1][j];
				curr++;
			}

			for (int j = M - 1 - i; j > i; j--) {
				a[curr][0] = j;
				a[curr][1] = N - i - 1;
				a[curr][2] = matrix[j][N - i - 1];
				curr++;
			}

			for (int j = N - i - 1; j > i; j--) {
				a[curr][0] = i;
				a[curr][1] = j;
				a[curr][2] = matrix[i][j];
				curr++;
			}

			w -= 2;
			h -= 2;
			a = turn(a, s);
			m = put(m, a);
		}
		print(m, M, N);
	}

	private static int[][] turn(int[][] a, int s) {
		int b[][] = new int[a.length][3];
		
		for (int i = 0; i < a.length; i++) {
			int d= i+s;
			d = (d >= a.length ? d-a.length : d);
			b[i][0] = a[i][0];
			b[i][1] = a[i][1];
			b[d][2] = a[i][2];
		}		
		return b;
	}

	private static int[][] put(int[][] matrix, int[][] a) {
		for (int i = 0; i < a.length; i++) {
			matrix[a[i][0]][a[i][1]] = a[i][2];
		}
		return matrix;
	}

	private static void print(int[][] matrix, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
