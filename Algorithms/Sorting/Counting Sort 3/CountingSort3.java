import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int count[] = new int[100];

		for (int i = 0; i < N; i++) {
			int k = in.nextInt();
			count[k]++;
			String s = in.next();
		}

		int d = 0;
		for (int i = 0; i < count.length; i++) {
			
				d = count[i]+d;
				System.out.print(d + " ");		
		}
	}
}
