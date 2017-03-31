import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long array[] = new long[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextLong();
		}

		Arrays.sort(array);
		long diff = array[1] - array[0];

		for (int i = 0; i < array.length - 1; i++) {
			long check = array[i + 1] - array[i];
			if (check < diff) {
				diff = check;
			}
		}
		System.out.println(diff);
	}
}
