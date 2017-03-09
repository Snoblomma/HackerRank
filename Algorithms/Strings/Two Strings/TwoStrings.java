import java.util.*;

public class Solution {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		String s[][] = new String[c][2];

		for (int i = 0; i < c; i++) {
			s[i][0] = in.next();
			s[i][1] = in.next();
		}

		for (int i = 0; i < c; i++) {
			System.out.println(common(s[i][0], s[i][1]));
		}

	}

	private static String common(String s1, String s2) {
		ArrayList<Character> c1 = new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++) {
			if(!c1.contains(s1.charAt(i))){
				c1.add(s1.charAt(i));
			}
		}

		ArrayList<Character> c2 = new ArrayList<Character>();
		for (int i = 0; i < s2.length(); i++) {
			if(!c2.contains(s2.charAt(i))){
				c2.add(s2.charAt(i));
			}
		}
		
		for (int i = 0; i < c1.size(); i++) {
			for (int j = 0; j < c2.size(); j++) {
				if(c1.get(i) == c2.get(j)){
					return "YES";
				}
			}
		}
		
		return "NO";
	}
}
