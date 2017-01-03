import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // number of toys

		int K = in.nextInt(); // money Mark has

		int n[] = new int[N];

		for (int i = 0; i < n.length; i++) {
			n[i] = in.nextInt();
		}

		Arrays.sort(n);

		int count = 0;

		for (int i = 0; i < n.length; i++) {
			K -= n[i];
			if (K > 0) {
				count++;
			} else {
				break;
			}
		}
		System.out.println(count);
	}
}
