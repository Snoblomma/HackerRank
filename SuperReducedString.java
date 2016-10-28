import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s = in.next();
		int n = s.length();

		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < n; i++) {
			list.add(s.charAt(i));
		}

		while (isReducable(list) == true) {
			for (int i = 0; i < list.size() - 1; i++) {

				if (list.get(i) == list.get(i + 1)) {
					list.set(i, 'A');
					list.set(i + 1, 'A');

				}
			}

			ListIterator<Character> e = list.listIterator();
			while (e.hasNext()) {
				if (e.next().equals('A')) {
					e.remove();
				}
			}

			s = "";

			for (int i = 0; i < list.size(); i++) {
				s = s + list.get(i);
			}

		}

		if (s.equals("")) {
			System.out.println("Empty String");
		} else {
			System.out.println(s);
		}

	}

	private static boolean isReducable(ArrayList<Character> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				return true;
			}
		}

		return false;
	}

}
