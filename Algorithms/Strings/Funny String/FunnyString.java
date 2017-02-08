import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		String[] s = new String[N];

		for (int i = 0; i < N; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < N; i++) {
			System.out.println(isFunny(s[i]));
		}

	}

	private static String isFunny(String string) {
		String r = new StringBuilder(string).reverse().toString();

		for (int i = 0; i < string.length() - 1; i++) {
			if (Math.abs(string.charAt(i) - string.charAt(i + 1)) != Math.abs(r.charAt(i) - r.charAt(i + 1))) {
				return "Not Funny";
			}
		}
		return "Funny";
	}
}
