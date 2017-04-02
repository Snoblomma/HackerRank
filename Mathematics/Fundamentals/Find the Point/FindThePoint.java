import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int px = in.nextInt();
			int py = in.nextInt();
			int qx = in.nextInt();
			int qy = in.nextInt();
			int rx = qx+(qx-px);
			int ry = qy+(qy-py);
			System.out.println(rx + " " + ry);
		}
	}
}
