import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); // queries

		Map<String, Double[]> map = new HashMap<String, Double[]>();

		for (int i = 0; i < N; i++) {
			String command = in.next();

			if (command.equals("SERVED")) {
				map = served(map);
			}

			else if (command.equals("ENTER")) {
				String name = in.next();
				Double[] a = new Double[2];
				a[0] = in.nextDouble();
				a[1] = in.nextDouble();
				map.put(name, a);
			}
		}

		if (map.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			print(map);
		}
	}

	private static void print(Map<String, Double[]> map) {
	
		System.err.println("Print");
		
		while (!map.isEmpty()) {
			Map<String, Double[]> m = new HashMap<String, Double[]>();
			m.putAll(map);
			Map<String, Double[]> map2 = new HashMap<String, Double[]>();
			map2 = served(map);			
			
			m.entrySet().removeAll(map2.entrySet());
			System.out.println(m.keySet().iterator().next());
		}
	}

	private static Map<String, Double[]> served(Map<String, Double[]> map) {

		String name = "";
		double max = 0;
		double token = 10 ^ 5;

		Set<String> set = map.keySet();
		Iterator e = set.iterator();

		while (e.hasNext()) {
			String val = (String) e.next();
			Double[] a = map.get(val);

			if (a[0] > max) {
				name = val;
				max = a[0];
				token = a[1];
			}

			else if (a[0] == max && val.compareTo(name) != 0) {
				if (val.compareTo(name) < 0) {
					name = val;
					max = a[0];
					token = a[1];
				}
			}

			else if (a[0] == max && val.compareTo(name) == 0) {
				if (a[1] < token) {
					name = val;
					max = a[0];
					token = a[1];
				}
			}
		}
		map.remove(name);
		return map;
	}
} 
