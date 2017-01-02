import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();// number of toys

		int w[] = new int[N];

		for (int i = 0; i < w.length; i++) {
			w[i] = in.nextInt();
		}

		// sort first:
		Arrays.sort(w);

		// create array of differences
		int diff[] = new int[N - 1];
		for (int i = 0; i < w.length - 1; i++) {
			diff[i] = w[i + 1] - w[i];
			System.err.print(diff[i] + " ");
		}

		int units = 1;
		int c = 0;

		for (int i = 0; i < diff.length; i++) {
			c += diff[i];
			if (c > 4) {
				units++;
				c = 0;
			}
		}	
		System.out.println(units);
	}
}
