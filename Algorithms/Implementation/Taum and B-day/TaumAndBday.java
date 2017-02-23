import java.util.*;

public class Solution {

    	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); //test cases
		
		for (int i = 0; i < T; i++) {
			long B = in.nextInt(); //number of black gifts
			long W = in.nextInt(); //number of white gifts
			
			long X = in.nextInt(); //cost of each black gift
			long Y = in.nextInt(); //cost of each white gift
			long Z = in.nextInt(); //cost of converting each black gift into white gift or vice versa
			
			long cost = 0;
			
			if(Z+Y >= X && Z+X >=Y){
				System.err.println(1);
				long k = Math.multiplyExact(B, X);
				long m = Math.multiplyExact(W, Y);
				cost = Math.addExact(k, m);
			}
			else if(Z+Y < X && Z+X >=Y){
				System.err.println(2);
				long k1 = Math.addExact(Z, Y);
				long k = Math.multiplyExact(B, k1);
				long m = Math.multiplyExact(W, Y);
				cost = Math.addExact(k, m);
			}
			else if(Z+Y >= X && Z+X < Y){
				System.err.println(3);
				long k = Math.multiplyExact(B, X);
				long m1 = Math.addExact(Z, X);
				long m = Math.multiplyExact(m1, W);
				cost = Math.addExact(k, m);
			}
			else if(Z+Y < X && Z+X < Y){
				System.err.println(4);
				long k1 = Math.addExact(Z, Y);
				long m1 = Math.addExact(Z, X);
				long k = Math.multiplyExact(B, k1);
				long m = Math.multiplyExact(W, m1);
				cost = Math.addExact(k, m);
			}

			System.out.println(cost);
		}
	}   	
}
