import java.math.BigInteger;
import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		System.out.println(tailFactorial(N, BigInteger.valueOf(1)));
	}

	private static BigInteger tailFactorial(int N, BigInteger res) {
		if (N < 1) {
			return res;
		} else {
			return tailFactorial(N - 1, res.multiply(BigInteger.valueOf(N)));
		}
	}   
}
