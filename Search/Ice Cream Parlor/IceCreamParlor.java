import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt(); // nuber of cases
		
		for (int i = 0; i < t; i++) {
			int m = in.nextInt(); //money
			int n = in.nextInt(); //number pf flavours
			
			int a[] = new int[n];
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
			}
			
			System.out.println(count(a, m));
		}
	}

	private static String count(int[] a, int m) {
		int k = 0;
		int b = 0;
		
		for (int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++){
				if(a[i] + a[j] == m){
					k = i+1;
					b = j+1;
				}
			}
		}
		
		return k + " " + b;
	}
}
