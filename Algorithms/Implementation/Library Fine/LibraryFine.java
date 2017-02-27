import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();

		int d = in.nextInt();
		int m = in.nextInt();
		int y = in.nextInt();

		System.out.println(getRes(d1, m1, y1, d, m, y));

	}

	private static int getRes(int d1, int m1, int y1, int d, int m, int y) {

		if (y1 > y) {
			return 10000;
		} else if (y1 < y) {
			return 0;
		} else if (m1 > m) {
			return (m1 - m) * 500;
		} else if (m1 < m) {
			return 0;
		} else if (d1 > d) {
			return (d1 - d) * 15;
		} else if (d1 < d) {
			return 0;
		} else {
			return 0;
		}
	}
}
