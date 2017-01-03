import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // number of flowers

		int K = in.nextInt(); // number of customers

		Integer f[] = new Integer[N]; // using Integer in order to be able to
										// use Collections.reverseOrder

		for (int i = 0; i < f.length; i++) {
			f[i] = in.nextInt();
		}

		// sorting prices
		Arrays.sort(f, Collections.reverseOrder());

		int customers[] = new int[K]; // number of flowers each customer
										// purchased

		for (int i = 0; i < customers.length; i++) {
			customers[i] = 0;
		}

		// we want to match highest price for a flower with a customer who has
		// the lowest number of flowers

		int sum = 0;
		int k = 0;
		for (int i = 0; i < f.length; i++) {
			sum += (customers[k] + 1) * f[i];
			customers[k]++;
			k++;
			k = (k > K - 1 ? k - K : k);
		}

		System.out.println(sum);
	}
}
