import java.util.*;

public class Solution {

    		public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int g = in.nextInt();

		for (int i = 0; i < g; i++) {
			int n = in.nextInt(); // number of cells on the board
			String b = in.next();
			if (areHappy(b, n) == true) {
				System.out.println("YES");
			} else {
				System.out.println(canBeHappy(b, n));
			}

		}
	}

	private static boolean areHappy(String b, int n) {
		if (n == 1) {
			return false;
		}

		else if (n == 2 && b.charAt(0) == b.charAt(1)) {
			if (b.charAt(0) == '_' || Character.isUpperCase(b.charAt(0))) {
				return true;
			}
		}

		else if (n > 2) {
			for (int i = 1; i < n - 1; i++) {
				if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1)) {
					return false;
				}
			}
			if (b.charAt(0) != b.charAt(1)) {
				return false;
			}
			if (b.charAt(n - 1) != b.charAt(n - 2)) {
				return false;
			}
			return true;
		}

		return false;
	}

	private static String canBeHappy(String b, int n) {
		int[] letters = new int[26];
		int spaces = 0;

		for (int i = 0; i < n; i++) {
			if (b.charAt(i) == '_') {
				spaces++;
			} else if (Character.isUpperCase(b.charAt(i))) {
				int c = Character.getNumericValue(b.charAt(i));
				letters[c - 10]++;
			} else {
				return "NO";
			}
		}

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 1) {
				return "NO";
			} else if (spaces == 0) {
				return "NO";
			}
		}
		return "YES";
	}
}
