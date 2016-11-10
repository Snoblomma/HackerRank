import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		
		for (int i = 0; i < q; i++) {
			int n = in.nextInt();
			
			int[][] matrix = new int[2*n][2*n];
			
			for (int j = 0; j < matrix.length; j++) {
				for (int j2 = 0; j2 < matrix.length; j2++) {
					matrix[j][j2] = in.nextInt();
				}
			}
			
			long res = 0;
			
			
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					int t1 = Math.max(matrix[j][j2], matrix[j][2*n-1-j2]);
					int t2 = Math.max(matrix[2*n-1-j][j2], matrix[2*n-1-j][2*n-1-j2]);
					int t = Math.max(t1, t2);				
					res+=t;
				}
			}	
			System.out.println(res);			
		}
	}	
}
