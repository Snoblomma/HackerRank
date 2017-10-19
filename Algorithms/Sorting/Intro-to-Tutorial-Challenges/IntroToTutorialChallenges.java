import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int V = in.nextInt(); // value we need to serch for
		int n = in.nextInt(); // size of array

		for (int i = 0; i < n; i++) {
			int f = in.nextInt();
			if (f == V) {
				System.out.println(i);
			}
		}
	}
}
