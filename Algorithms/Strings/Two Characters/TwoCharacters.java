import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		String s = in.next();

		// find out what characters are present
		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!list.contains(s.charAt(i))) {
				list.add(s.charAt(i));
			}
		}

		int res = 0;
		// System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				String k = "";
				for (int k2 = 0; k2 < s.length(); k2++) {
					if (s.charAt(k2) == list.get(i) || s.charAt(k2) == list.get(j)) {
						k = k + s.charAt(k2);
					}
				}

				System.err.println(list.get(i) + ", " + list.get(j) + ": " + k);

				if (isValid(k) && k.length() > res) {
					res = k.length();
				}
			}
		}
		System.out.println(res);
	}

	private static boolean isValid(String k) {
		for (int i = 0; i < k.length() - 1; i++) {
			if (k.charAt(i) == k.charAt(i + 1)) {
				System.err.println(k + " is NOT valid");
				return false;
			}
		}
		System.err.println(k + " is valid");
		return true;
	}
}
