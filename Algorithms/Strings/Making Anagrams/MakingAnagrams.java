import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();

		System.out.println(countToAnagram(s1, s2));
	}

	private static int countToAnagram(String k1, String k2) {

		int count = 0;

		int s1[] = new int[26];
		int s2[] = new int[26];

		// trasforming Unicode character to 0-25
		for (int i = 0; i < k1.length(); i++) {
			int d = Character.getNumericValue(k1.charAt(i)) - 10;
			s1[d]++;
		}

		for (int i = 0; i < k2.length(); i++) {
			int d = Character.getNumericValue(k2.charAt(i)) - 10;
			s2[d]++;
		}
		
		for (int i = 0; i < s2.length; i++) {
			count += Math.abs(s1[i]-s2[i]);
		}

		return count;
	}
}
