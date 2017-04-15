import java.util.*;

public class Solution {

   	static long sum = 2;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		long n = in.nextInt();
		long m = 2;
		System.out.println(rec(m, n));
	}

	private static long rec(long m, long n) {
		if (n > 1) {
			m = (m*3)/2;
			sum += m; 
			n--;
			rec(m, n);
		}
		return sum;
	}
}
