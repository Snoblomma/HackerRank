import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ar[] = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}

		int pivot = ar[0];

		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> equal = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < pivot) {
				left.add(ar[i]);
			} else if (ar[i] == pivot) {
				equal.add(ar[i]);
			} else if (ar[i] > pivot) {
				right.add(ar[i]);
			}
		}
		
		left.addAll(equal);
		left.addAll(right);
		
		for (int i = 0; i < left.size(); i++) {
			System.out.print(left.get(i) + " ");
		}
	}
}
