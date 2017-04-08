import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			BigInteger res = new BigInteger("1");
			for (int j = 0; j < n-1; j++) {
				String ni = in.next();
				BigInteger nib = new BigInteger(ni);
				res = res.multiply(nib);
			}
			System.out.println(res.mod(new BigInteger("1234567")));
		}
	}
}
