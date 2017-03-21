import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for (int i = 0; i < N; i++) {
			String s = in.next();
			System.out.println(contains(s));
		}
	}

	private static String contains(String s) {
		String h = "hackerrank";
		char[] c = new char[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = h.charAt(i);
		}

		int j = 0;
		int i = 0;
		while (i < s.length()) {
			if (j == c.length-1) {
				return "YES";
			} else if (j < c.length-1) {
				if (s.charAt(i) == c[j]) {
					i++;
					j++;
				} else {
					i++;
				}
			}
		}
		return "NO";
	}
}
