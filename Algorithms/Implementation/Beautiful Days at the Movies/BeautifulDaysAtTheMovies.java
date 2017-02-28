import java.util.*;

public class Solution {

    		public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		long i = in.nextLong();
		long j = in.nextLong();

		long k = in.nextLong();

		long count = 0;
		for (long s = i; s <= j; s++) {
			if (isBeautiful(s, k)) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static boolean isBeautiful(long s, long k) {
		String d = String.valueOf(s);
		String reverse = new StringBuffer(d).reverse().toString();
		long srev = Long.valueOf(reverse);

		long h = Math.abs(s - srev);

		if (h % k == 0) {
			return true;
		} else {
			return false;
		}	
	}
}
