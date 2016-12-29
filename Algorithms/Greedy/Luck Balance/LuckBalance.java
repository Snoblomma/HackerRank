import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // number of contests
		int K = in.nextInt(); //

		int count1 = 0;

		int s[][] = new int[N][2];

		for (int i = 0; i < N; i++) {
			s[i][0] = in.nextInt();
			s[i][1] = in.nextInt();
			if (s[i][1] == 1) {
				count1++;
			}
		}

		int d = 0;

		int diff = count1 - K;
		System.err.println("diff = "+  diff);
		
		if(diff <=0){
			for (int i = 0; i < s.length; i++) {
				d+=s[i][0];
			}		
		}
		else{
			ArrayList<Integer> k = new ArrayList<Integer>();

			for (int i = 0; i < s.length; i++) {
				if (s[i][1] == 1) {
					k.add(s[i][0]);
				}
			}

			Collections.sort(k);
			
			// add zeroes first:
			for (int i = 0; i < s.length; i++) {
				if (s[i][1] == 0) {
					d += s[i][0];
				}
			}

			// subtract diff amount of 1
			for (int i = 0; i < diff; i++) {
				d -= k.get(i);
			}

			// add the rest of ones
			for (int i = diff; i < k.size(); i++) {
				d += k.get(i);
			}		
		}
		System.out.println(d);
	}   
}
