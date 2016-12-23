import java.io.*;
import java.util.*;

public class Solution {

   	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long A[] = new long[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = in.nextLong();
		}
		
		Arrays.sort(A);
		minDiff(A);
		
	}

	private static void minDiff(long A[]) {
		long min = Math.abs(A[0]-A[1]);
		
		long res[] = new long[2];
		res[0] = A[0];
		res[1] = A[1];
		
		for (int i = 2; i < A.length; i++) {

			long s = Math.abs(A[i]-A[i-1]);
			if(s == min){
				res = Arrays.copyOf(res, res.length+2);
				res[res.length-2] = A[i-1];
				res[res.length-1] = A[i];
			}
			else if(s < min){
				min = s;
				res = new long[2];
				res[0] = A[i-1];
				res[1] = A[i];
			}
		}
		
		//print out
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}	
	}
}
