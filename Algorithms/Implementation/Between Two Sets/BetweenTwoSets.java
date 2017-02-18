import java.util.*;

public class Solution {

  	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int A[] = new int[N];
		int B[] = new int[M];
		
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		for (int i = 0; i < M; i++) {
			B[i]= in.nextInt();
		}
		
		System.out.println(between(A, B));
		
	}

	private static int between(int[] a, int[] b) {		
		Set<Integer> numbers = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			numbers.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int k = a[i]*a[j];
				if(!numbers.contains(k)){
					numbers.add(k);
				}
			}
		}
		
		//adding factors of b[i]
		for (int i = 0; i < b.length; i++) {
			ArrayList<Integer> factors = new ArrayList<Integer>();
			factors = fact(b[i]);
			numbers.addAll(factors);
		}

		Iterator e = numbers.iterator();
		while(e.hasNext()){
			Integer k = (Integer) e.next();
			for (int i = 0; i < b.length; i++) {
				if(b[i]%k != 0){
					e.remove();
					break;
				}
				if(k > b[i]){
					e.remove();
					break;
				}
			}
		}
        
		Iterator f = numbers.iterator();
		while(f.hasNext()){
			int k = (int) f.next();
			for (int i = 0; i < a.length; i++) {
				if(k%a[i] != 0 ){
					f.remove();
					break;
				}
				if(k < a[i]){
					f.remove();
					break;
				}
			}
		}
	
		return numbers.size();
	}

	private static ArrayList<Integer> fact(int b) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for (int i = b; i > 0; i--) {
			if(b%i == 0){
				factors.add(i);
			}
		}		
		return factors;
	}
}
