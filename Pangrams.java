import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				list.add(Character.toLowerCase(s.charAt(i)));
			}
		}

		ArrayList<Character> res = new ArrayList<Character>();

		for (int i = 0; i < list.size(); i++) {
			if (!res.contains(list.get(i))) {
				res.add(list.get(i));
			}
		}

		if (res.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}
