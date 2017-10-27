import java.util.*;

public class Solution {
	public static void insertionSort(int[] A) {
		int count = 0;

		for (int i = 1; i < A.length; i++) {
			if(A[i] < A[i-1]){
				for (int j = i; j > 0; j--) {
					if(A[j] < A[j-1]){
						int k = A[j];
						A[j]=A[j-1];
						A[j-1] = k;
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
	}
}
