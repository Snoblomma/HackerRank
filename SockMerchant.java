import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c[] = new int[n];

		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		int count = 0;

		for (int i = 0; i < c.length - 1; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j] && c[i] != -1 && c[j] != -1) {
					c[i] = -1;
					c[j] = -1;
					count++;
				}
			}
		}		
		System.out.println(count);
    }
}
