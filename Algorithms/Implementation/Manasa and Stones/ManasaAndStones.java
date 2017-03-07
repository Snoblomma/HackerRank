import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();// test cases

		for (int i = 0; i < T; i++) {
			int n = in.nextInt();// number of stones
			int a = in.nextInt();
			int b = in.nextInt();

			if(a == b){
				System.out.println(a*(n-1));
				
			}
			else {
				if (a < b) {
					int k = b;
					b = a;
					a = k;
				}

				int point = 0;// starting point
				int res[] = new int[n];

				for (int j = 0; j < n; j++) {
					int k1 = j * a;
					int k2 = (n-1 - j) * b;
					res[j] = k1 + k2;
				}

				for (int j = 0; j < res.length; j++) {
					System.out.print(res[j] + " ");
				}
				System.out.println();
			}		
		}
	}
}
