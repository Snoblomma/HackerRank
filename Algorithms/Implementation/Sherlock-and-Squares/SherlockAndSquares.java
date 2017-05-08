import java.util.*;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // number of cases;

		for (int i = 0; i < n; i++) {

			long a = in.nextLong();
			long b = in.nextLong();

			System.out.println(isSquare(a, b));
		}
	}

	private static long isSquare(long a, long b) {
		long count = 0;

		long sqa = (long) Math.sqrt(a);
		long sqb = (long) Math.sqrt(b);

		if ((sqa * sqa) == a) {
			count++;
		}

		count += sqb - sqa;

		return count;
	}
}
