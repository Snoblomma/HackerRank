import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// grid dimensions
		long n = in.nextLong();
		long m = in.nextLong();

		Map<Long, ArrayList<long[]>> map = new HashMap<Long, ArrayList<long[]>>();

		// number of trains
		int k = in.nextInt();

		Long line = (long) 0;
		for (int i = 0; i < k; i++) {
			line = in.nextLong();
			long start = in.nextLong();
			long end = in.nextLong();

			if (!map.containsKey(line)) {
				ArrayList<long[]> s1 = new ArrayList<long[]>();
				long[] f = new long[2];
				f[0] = start;
				f[1] = end;
				s1.add(f);
				map.put(line, s1);				
			}

			else if (map.containsKey(line)) {
				ArrayList<long[]> s2 = new ArrayList<long[]>();
				s2 = map.get(line);

				ArrayList<long[]> add = new ArrayList<long[]>();
				
				for (int j = 0; j < s2.size(); j++) {					
					long[] h = new long[2];                   
					h = s2.get(j);
					long[] g = new long[2];
                    
					if (start >= h[0] && end > h[1] && start <= h[1]) {
						h[1] = end;
						s2.set(j, h);
					} else if (start < h[0] && end <= h[1] && end >= h[0]) {
						h[0] = start;
						s2.set(j, h);
					} else if (start < h[0] && end > h[1]) {
						h[0] = start;
						h[1] = end;
						s2.set(j, h);
					}
                    else  if (end < h[0] || start > h[1]){
					   g[0] = start;
					   g[1] = end;
					   add.add(g);
				    }    
				}		
				
				s2.addAll(add);

				map.put(line, s2);
			}
		}

		Set<Long> set = map.keySet();
		Iterator e = set.iterator();

		long res = n * m;
		
		while (e.hasNext()) {
			Long r = (Long) e.next();
			ArrayList<long[]> l = new ArrayList<long[]>();
			l = map.get(r);
			long d = 0;
			for (int i = 0; i < l.size(); i++) {
				long h[] = new long[2];
				h = l.get(i);
				d = d + (h[1] - h[0]+1);
			}
			res = res - d;
		}
		System.out.println(res);
	}
}
