import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		quickSort(A, 0, A.length-1);
	}

	private static int[] quickSort(int[] A, int lo, int hi) {
		if (lo < hi) {
			int p = partition(A, lo, hi);
					
			quickSort(A, lo, p - 1);
			quickSort(A, p + 1, hi);
		}
		return A;
	}

	private static int partition(int[] A, int lo, int hi) {
		int pivot = A[hi];
		int i = lo;
		for (int j = lo; j < hi; j++) {
			if (A[j] <= pivot) {
				// swap A[i] with A[j]
				int k = A[i];
				A[i] = A[j];
				A[j] = k;
				i++;
			}
		}

		// swap A[i] with A[hi]
		int k = A[i];
		A[i] = A[hi];
		A[hi] = k;
        // print out
		print(A);
		
		return i;
	}

	private static void print(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}
