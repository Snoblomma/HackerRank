import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			list.add(in.next());
		}
		
		int Q = in.nextInt();//number of queries
		
		for (int i = 0; i < Q; i++) {
			String t = in.next();
			System.out.println(freq(t, list));
		}	
	}

	private static int freq(String t, ArrayList<String> list) {
		int count = Collections.frequency(list, t);
		return count;
	}
}
