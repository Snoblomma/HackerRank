import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			A.add(in.nextInt());
		}
		
		int m = in.nextInt();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			B.add(in.nextInt());
		}
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		System.err.println("num created");
		
		for (int i = 0; i < A.size(); i++) {
			if(!num.contains(A.get(i))){
				num.add(A.get(i));
			}
		}
		System.err.println("num " + num);
		
		
		int diffA[] = new int[num.size()];
		for (int i = 0; i < num.size(); i++) {
			diffA[i] = Collections.frequency(A, num.get(i));
		}
		
		int diffB[] = new int[num.size()];
		for (int i = 0; i < num.size(); i++) {
			diffB[i] = Collections.frequency(B, num.get(i));
		}
		
		
		ArrayList<Integer> diff = new ArrayList<Integer>();
		for (int i = 0; i < num.size(); i++) {
			if(diffA[i]<diffB[i]){
				for (int j = 0; j < diffB[i]-diffA[i]; j++) {
					diff.add(num.get(i));
				}
			}
		}
		
		Set<Integer> hs = new HashSet<>();
		hs.addAll(diff);
		diff.clear();
		diff.addAll(hs);
		Collections.sort(diff);
		for (int i = 0; i < diff.size(); i++) {
			System.out.print(diff.get(i) + " ");
		}
		System.err.println("Printed");
	}
}
