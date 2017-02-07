import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();

		int A[][] = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = in.nextInt();
			}
		}

		System.out.println(maxRegion(A, N, M));

	}

	private static int maxRegion(int[][] a, int N, int M) {

		int max = 0;

		while (isNotEmpty(a, N, M)) {
			ArrayList<Integer[]> list = new ArrayList<Integer[]>();
			
			//first go and second go, in case we missed smth:
			for (int k = 0; k < 2; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < M; j++) {
						if (a[i][j] == 1 && list.isEmpty()) {
							Integer[] d = new Integer[2];
							d[0] = i;
							d[1] = j;
							list.add(d);
							a[i][j] = 0;

						} else if (a[i][j] == 1 && hasItsNeighbour(list, i, j)) {
							Integer[] d = new Integer[2];
							d[0] = i;
							d[1] = j;
							list.add(d);
							a[i][j] = 0;
						}
					}
				}
			}	

			if (list.size() > max) {
				max = list.size();
			}
		}
		return max;
	}

	private static boolean hasItsNeighbour(ArrayList<Integer[]> list, int i, int j) {

		for (int j2 = 0; j2 < list.size(); j2++) {
			Integer[] d = list.get(j2);
			int k1 = d[0];
			int k2 = d[1];

			if (k1 == i && k2 == j + 1) {
				return true;
			} else if (k1 == i + 1 && k2 == j) {
				return true;
			} else if (k1 == i + 1 && k2 == j + 1) {
				return true;
			} else if (k1 == i && k2 == j - 1) {
				return true;
			} else if (k1 == i - 1 && k2 == j) {
				return true;
			} else if (k1 == i - 1 && k2 == j - 1) {
				return true;
			} else if (k1 == i - 1 && k2 == j + 1) {
				return true;
			} else if (k1 == i + 1 && k2 == j - 1) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNotEmpty(int[][] a, int N, int M) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a[i][j] == 1) {
					return true;
				}
			}
		}
		return false;
	}
}
