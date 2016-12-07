import java.util.*;

public class Solution {
		public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // size of array

		int c[] = new int[n];

		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}

		int e = c[n - 1]; // unsorted number

		for (int i = n - 2; i >= 0; i--) {
				if (c[i] > e) {
					c[i + 1] = c[i];
					print(c);
                  
				} else if (c[i] <= e) {
					c[i + 1] = e;
					print(c);
                    break;
				}
				
		}
		if(c[0]==c[1]){
			c[0] = e;
			print(c);
		}	
	}

	private static void print(int[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}
}
