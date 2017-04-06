import java.util.*;

public class Solution {
    
		public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); //number of cases	
		
		for (int i = 0; i < n; i++) {
			System.out.println(getHeight(in.nextInt()));
		}
	}

	private static int getHeight(int k) {
		
		int height = 1;
		
		for (int i = 0; i <= k-1; i++) {
			if(i%2==0){
				height*=2;
			}
			else if(i%2==1){
				height++;
			}
		}
		return height;
	}
}
