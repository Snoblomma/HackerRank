import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt();
		}
		
		
		int couples = 0;
		//finding couples:
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i]!= -1 && B[j]!= -1 && A[i] == B[j]){
					System.err.println("couple " + i + " " + j);
					couples++;
					A[i] = -1;
					B[j] = -1;
				}
			}
		}
		System.err.println("couples " + couples);
		
		couples = (couples == N ? couples-1 : couples+1);
		
		System.out.println(couples);
	}
}
