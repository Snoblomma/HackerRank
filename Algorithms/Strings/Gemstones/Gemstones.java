import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] s = new String[N];

		for (int i = 0; i < N; i++) {
			s[i] = in.next();
		}

		ArrayList<Character> list = new ArrayList<Character>();

		// list of all possible letters:
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (!list.contains(s[i].charAt(j))) {
					list.add(s[i].charAt(j));
				}
			}
		}

		for (int i = 0; i < N; i++) {

			ArrayList<Character> string = new ArrayList<Character>();
            
			for (int j = 0; j < s[i].length(); j++) {
				string.add(s[i].charAt(j));
			}
            
			Iterator e = list.iterator();

			while (e.hasNext()) {
				if (!string.contains(e.next())) {
					e.remove();
				}
			}
		}

		System.out.println(list.size());
	}
}
