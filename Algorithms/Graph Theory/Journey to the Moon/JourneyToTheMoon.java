import java.io.*;
import java.util.*;

public class Solution {
   public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = bfr.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int I = Integer.parseInt(temp[1]);

		int added[] = new int[N];
		int count = 1;

		for (int i = 0; i < I; i++) {
			temp = bfr.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);

			if (added[a] == 0 && added[b] == 0) {
				added[a] = count;
				added[b] = count;
				count++;
			} else if (added[a] == 0 && added[b] != 0) {
				added[a] = added[b];
			} else if (added[a] != 0 && added[b] == 0) {
				added[b] = added[a];
			} else if (added[a] != 0 && added[b] != 0 && added[a] > added[b]) {

				int s = added[a];
				for (int j = 0; j < added.length; j++) {
					if (added[j] == s) {
						added[j] = added[b];
					}
				}

			} else if (added[a] != 0 && added[b] != 0 && added[a] < added[b]) {

				int s = added[b];
				for (int j = 0; j < added.length; j++) {
					if (added[j] == s) {
						added[j] = added[a];
					}
				}
			}
		}

		long combinations = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int j = 0; j < added.length; j++) {
			if (map.containsKey(added[j])) {
				Integer d = map.get(added[j]);
				d++;
				map.put(added[j], d);
			} else if (!map.containsKey(added[j])) {
				map.put(added[j], 1);
			}
		}

       //creating array which represents numbers of people from each country
		ArrayList<Integer> d = new ArrayList<Integer>();

       //we need to assume that not included in list people are aech from different country
		if (map.containsKey(0)) {
			Integer K = map.get(0);

			for (int j = 0; j < K; j++) {
				d.add(1);
			}

			Set<Integer> set1 = map.keySet();

			Iterator e1 = set1.iterator();
			while (e1.hasNext()) {
				Integer i = (Integer) e1.next();
				if (!i.equals(0)) {
					d.add(map.get(i));
				}
			}
		}

		else {
			Set<Integer> set1 = map.keySet();

			Iterator e1 = set1.iterator();
			while (e1.hasNext()) {
				Integer i = (Integer) e1.next();
				d.add(map.get(i));
			}
		}

		
		int  f[] = new int[d.size()];
		for (int j = 0; j < f.length; j++) {
			f[j] = d.get(j);
		}
		
		
		for (int j = 0; j < f.length-1; j++) {
			for (int j2 = j+1; j2 < f.length; j2++) {
				combinations += f[j]*f[j2];
			}
		}
		System.out.println(combinations);
	}
}
