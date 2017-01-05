import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int q = in.nextInt(); // number of queries

		for (int i = 0; i < q; i++) {

			int n = in.nextInt(); // size of array
			int k = in.nextInt(); // the relation variable

			int A[] = new int[n];
			int B[] = new int[n];

			for (int j = 0; j < A.length; j++) {
				A[j] = in.nextInt();
			}
			
			for (int j = 0; j < B.length; j++) {
				B[j] = in.nextInt();
			}
			
			System.out.println(getRes(A, B, k));
		}

	}

	private static String getRes(int[] A, int[] B, int k) {		
		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = 0; i < A.length; i++) {
			if (A[i] + B[B.length - 1 - i] < k) {
				return "NO";
			}
		}
		return "YES";
	}
}
