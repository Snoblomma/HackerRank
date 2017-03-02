import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int K = in.nextInt();
        K = K%26;
        
		String h = "";
		for (int i = 0; i < N; i++) {
			String t = S.substring(i, i + 1);
			char d = t.charAt(0);
			if (t.matches("[a-zA-Z]")) {
				if (Character.isLowerCase(d) == true) {
					d += K;
					if (d > 122) {
						d = (char) (d - 26);
					}
				} else if (Character.isUpperCase(d) == true) {
					d += K;
					if (d > 90) {
						d = (char) (d - 26);
					}
				}
			}

			h += d;
		}
		System.out.println(h);
    }
}
