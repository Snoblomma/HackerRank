import java.util.*;

class Solution{
   public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		Map<String, Integer> map = new HashMap<String, Integer>();

		in.nextLine();
		for (int i = 0; i < N; i++) {
			String name = in.nextLine();
			int number = in.nextInt();
			map.put(name, number);
			in.nextLine();
		}

		while (in.hasNext()) {
			String query = in.nextLine();
			if (map.containsKey(query)) {
				System.out.println(query + "=" + map.get(query));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
