import java.util.*;

public class Solution {
    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); // array size
		int p[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			p[i] = in.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			int k = 0;
			for (int j = 0; j < N; j++) {
				if(i==p[p[j]-1]){
					k = j+1;
				}
			}
			System.out.println(k);
		}
	}
}
