import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // size of array
		long K = in.nextLong(); // number of swaps allowed

		int a[] = new int[N];
		int b[] = new int[N];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			b[a[i]-1] = i;
		}
		
		for (int i = 0; i < N - 1; i++) {
			if (K > 0) {
				 if (a[i] != N - i) {
					int M = a[i];				
					
					int k = a[b[N-i-1]];
					a[b[N-i-1]] = a[i];
					a[i] = k;
					
					int pos = b[N-i-1];
					b[N-i-1] = b[M-1];
					b[M-1] = pos;
					
					K--;
				}
			}
			
			else {
				break;
			}
		}
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}   
}
