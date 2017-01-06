import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int t[][] = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			t[i][0] = in.nextInt();
			t[i][1] = t[i][0] + in.nextInt();
			t[i][0] = i+1;
		}
		
		
		//insertion sort
		t = insertionSort(t);
		
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i][0] + " ");
		}	
	}
	
	
	public static int[][] insertionSort(int[][] ar) {
		for (int i = 1; i < ar.length; i++) {
			if(ar[i][1] < ar[i-1][1]){
				for (int j = i; j > 0; j--) {
					if(ar[j][1] < ar[j-1][1]){
						int k = ar[j][1];
						ar[j][1]=ar[j-1][1];
						ar[j-1][1] = k;
						
						int m = ar[j][0];
						ar[j][0]=ar[j-1][0];
						ar[j-1][0] = m;
					}
				}
				
			}
		}
		return ar;	
	}
}
