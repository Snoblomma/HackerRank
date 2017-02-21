
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // dimension of array
		int k = in.nextInt(); // number of rotations
		int q = in.nextInt(); // number of queries

		// reading array
		Integer[] array = new Integer[n];
		for (int a_i = 0; a_i < n; a_i++) {
			array[a_i] = in.nextInt();
		}

		// reading queries
		int[] que = new int[q];
		for (int a0 = 0; a0 < q; a0++) {
			que[a0] = in.nextInt();
		}

		// rotating array k times:
		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(array));
		ar = new ArrayList<>(ar);

		if (k >= n) {
			k = k % n;
		}

		if (k != 0) {
			for (int i = 0; i < k; i++) {
				Integer t = ar.get(n - 1);
				ar.add(0, t);
				ar.remove(n);
			}
		}

		// printing out:
		for (int i = 0; i < q; i++) {
			System.out.println(ar.get(que[i]));
		}
	}
}
