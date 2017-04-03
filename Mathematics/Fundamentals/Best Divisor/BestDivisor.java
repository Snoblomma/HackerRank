import java.util.*;

public class Solution {

   public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> divisors = getDiv(n);
		System.out.println(bestDivisor(divisors));
	}

	private static int bestDivisor(ArrayList<Integer> divisors) {	
		int best = divisors.get(0);
		int bestSum = sum(best);
		
		for (int i = 0; i < divisors.size(); i++) {
			if(sum(divisors.get(i)) == bestSum){
				if(divisors.get(i) < best){
					best = divisors.get(i);
					bestSum = sum(divisors.get(i));
				}
			}
			else if(sum(divisors.get(i)) > bestSum){
				best = divisors.get(i);
				bestSum = sum(divisors.get(i));
			}
		}	
		return best;
	}

	private static int sum(int best) {
		int count[] = new int[String.valueOf(best).length()];
		int sum = 0;
		
		for (int i = 0; i < count.length; i++) {
			count[i] = Integer.valueOf(String.valueOf(best).charAt(i)) - 48;
		}
		
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
		}
		return sum;
	}

	private static ArrayList<Integer> getDiv(int n) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			if(n%i==0){
				divisors.add(i);
			}
		}		
		return divisors;
	}
}
