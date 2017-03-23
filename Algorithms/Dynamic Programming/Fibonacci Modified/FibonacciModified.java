import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String t1 = in.next();
		String t2 = in.next();
		int n = in.nextInt();
		
		BigInteger e1 = new BigInteger(t1);
		BigInteger e2 = new BigInteger(t2);
		
		BigInteger e = new BigInteger("0");
		e = fib(e1, e2, n-1);
		System.out.println(e);
	}

	private static BigInteger fib(BigInteger e1, BigInteger e2, int n) {
		BigInteger res = new BigInteger("0");
		res = e1.add(e2.multiply(e2));
		System.err.println(res);
		if(n == 2){
			return 	res;
		}
		else{
			return fib(e2, res, n-1);
		}
	}
}
