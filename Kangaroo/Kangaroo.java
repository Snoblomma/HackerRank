import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		int low = 0;
		int high = 0;
		int vlow = 1;
		int vhigh = 2;

		if (x1 <= x2) {
			low = x1;
			vlow = v1;
			high = x2;
			vhigh = v2;
		} else if (x1 > x2) {
			low = x2;
			vlow = v2;
			high = x1;
			vhigh = v1;
		}

		int dif = high - low;
		int prevdif = dif;

		while (low < high && prevdif >= dif) {

			low += vlow;
			high += vhigh;

			if (low == high) {
				System.out.println("YES");
			} else if (low > high) {
				System.out.println("NO");
			} else if (low < high) {
				if (high - low >= dif) {
					prevdif = 0;
					System.out.println("NO");
				} else if (high - low < dif) {
					prevdif = dif;
					dif = high - low;
				}
			}
		}
    }
}
