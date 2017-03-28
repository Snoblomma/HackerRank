import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String[] s = new String[T];

		for (int i = 0; i < T; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < T; i++) {
			System.out.println(getRes(s[i]));
		}

	}

	private static int getRes(String string) {
		int res = 0;

		char[] s = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			s[i] = string.charAt(i);
		}

		for (int i = 0; i < string.length() - 1; i++) {
			if (s[i] == s[i + 1]) {
				res++;
			}
		}

		return res;
	}

}
