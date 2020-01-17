import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] w = new String[t];

		for (int i = 0; i < t; i++) {
			w[i] = in.next();
		}

		for (int i = 0; i < t; i++) {
			System.out.println(w[i] + " " + nextLex(w[i]));
		}

	}

	private static String nextLex(String string) {

		for (int i = 2; i <= string.length(); i++) {
			String first = string.substring(0, string.length() - i);
			String second = string.substring(string.length() - i);
			//System.out.println("First: " + first + " second: " + second);

			char temp = second.charAt(0);

			char s[] = new char[second.length()];

			for (int j = 0; j < second.length(); j++) {
				s[j] = second.charAt(j);
			}

			char sort[] = Arrays.copyOf(s, s.length);
			Arrays.sort(sort);

			for (int j = 0; j < sort.length; j++) {
				if (sort[j] > temp) {
					second = String.valueOf(sort[j]);

					for (int j2 = 0; j2 < sort.length; j2++) {
						if (j2!=j) {
							second = second + String.valueOf(sort[j2]);
						}				
					}

					return first + second;
				}
			}

		}
		return "no answer";
	}

}
