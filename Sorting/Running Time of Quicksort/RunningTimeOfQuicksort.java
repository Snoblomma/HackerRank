import java.util.*;

public class Solution {

  public static int s = 0; //counter of shifts of quickSort
	private static int s2 = 0; //shifts of insertion
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		int B[] = Arrays.copyOf(A, A.length);
		
		quickSort(A, 0, A.length-1);
		insertionSortPart2(B);
		
		System.out.println(s2-s);
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
				s++;
			}
		}

		// swap A[i] with A[hi]
		int k = A[i];
		A[i] = A[hi];
		A[hi] = k;
		s++;

		return i;
	}
	
	
	private static void insertionSortPart2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			if(ar[i] < ar[i-1]){
				for (int j = i; j > 0; j--) {
					if(ar[j] < ar[j-1]){
						int k = ar[j];
						ar[j]=ar[j-1];
						ar[j-1] = k;
						s2++;
					}
				}
			}
		}
	}
}
