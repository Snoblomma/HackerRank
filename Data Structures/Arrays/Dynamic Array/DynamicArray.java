import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Q = in.nextInt();

		ArrayList<int[]> list = new ArrayList<int[]>();

		for (int i = 0; i < N; i++) {
			int a[] = new int[0];
			list.add(a);
		}

		int lastAns = 0;

		for (int i = 0; i < Q; i++) {
			int type = in.nextInt(); // type of query
			int x = in.nextInt();
			int y = in.nextInt();

			if (type == 1) {
				int index = (x ^ lastAns) % N;
				list = append(list, index, y);
			} 
			else if (type == 2) {
				int index = (x ^ lastAns) % N;
				
				int seq[] = list.get(index);
				
				int k = y%seq.length;
				
				lastAns = seq[k];
				System.out.println(lastAns);
			}
		}
	}

	private static ArrayList<int[]> append(ArrayList<int[]> list, int index, int y) {
		int seq[] = list.get(index);

		seq = Arrays.copyOf(seq, seq.length + 1);
		seq[seq.length - 1] = y;

		list.set(index, seq);

		return list;
	}
}
