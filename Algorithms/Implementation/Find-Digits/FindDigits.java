import java.io.*;
import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt(); // number of cases

		for (int i = 0; i < n; i++) {
			long k = in.nextLong();
			System.out.println(printRes(k));
		}
	}

	private static int printRes(long k) {
		int res = 0;
		String g = String.valueOf(k);
		for (int i = 0; i < g.length(); i++) {
			int s = Integer.parseInt(g.substring(i, i + 1));

			if (s != 0) {
				if (k % s == 0) {
					res++;
				}
			}
		}
		return res;
	}
}
