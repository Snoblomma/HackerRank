import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long count[] = new long[5];
		
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			count[a-1]++;
		}
		
		long max = 0;
		int maxi = 0;
		for (int i = count.length-1; i >= 0; i--) {
			if(count[i] >= max){
				max = count[i];
				maxi = i;
			}
		}	
		System.out.println(maxi + 1);
	}
}
