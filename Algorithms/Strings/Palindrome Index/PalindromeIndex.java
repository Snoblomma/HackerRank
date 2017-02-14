import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String s[] = new String[t];

		for (int i = 0; i < t; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < t; i++) {
			System.out.println(palindromeIndex(s[i]));
		}

	}

	private static long palindromeIndex(String string) {

		if (isPal(string) == true) {
			return -1;
		}

		else {
			char[] c = string.toCharArray();

			for (int i = 0; i < c.length / 2; i++) {
				if (c[i] != c[c.length - 1 - i]) {
					String s = string.substring(i, c.length - 1 - i);
					if (isPal(s) == false) {
						return i;
					} else {
						return c.length - 1 - i;
					}
				}
			}
			return -1;
		}
	}

	private static boolean isPal(String s) {
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length/2; i++) {
			if (c[i] != c[c.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
