import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Integer[] array = new Integer[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		List<Integer> ar = new ArrayList<Integer>(Arrays.asList(array));
		ar = new ArrayList<>(ar);

		while (ar.size() > 0) {
			System.err.println(ar);
			System.out.println(ar.size());

			// finding smallest:
			int small = 1000;
			for (int i = 0; i < ar.size(); i++) {
				if (ar.get(i) < small) {
					small = ar.get(i);
				}
			}

			System.err.println("Smallest: " + small);

			// substracting the smallest from every number:
			for (int i = 0; i < ar.size(); i++) {
				int k = ar.get(i);
				k -= small;
				ar.set(i, k);
			}

			// Iterator to loop through the list:
			for (Iterator<Integer> iter = ar.listIterator(); iter.hasNext();) {
				Integer a = iter.next();
				if (a <= 0) {
					iter.remove();
				}
			}

		}
    }
}
