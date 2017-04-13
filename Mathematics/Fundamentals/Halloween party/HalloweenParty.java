import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long k = in.nextLong();
			System.out.println(pieces(k));
		}
	}

	private static long pieces(long k) {
		long a = k/2;
		long b = k - a;
		return a*b;
	}
}
