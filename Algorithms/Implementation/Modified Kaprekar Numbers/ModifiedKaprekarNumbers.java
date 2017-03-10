import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int low = in.nextInt();
		int high = in.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = low; i <= high; i++) {
			if (isMKN(i)) {
				list.add(i);
			}
		}

		if (list.isEmpty()) {
			System.out.println("INVALID RANGE");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
	}

	private static boolean isMKN(int i) {
		 
		String n = String.valueOf(i);
		BigInteger a = new BigInteger(n);
		BigInteger sq = a.multiply(a);
		
		int d = String.valueOf(n).length();
		String s = sq.toString();
		int r = Integer.valueOf(s.substring(s.length()-d));
		int l = 0;
		if (s.length() > d) {
			l = Integer.valueOf(s.substring(0, s.length()-d));
		}

		if (l + r == i) {
			return true;
		} else {
			return false;
		}
	}
}
