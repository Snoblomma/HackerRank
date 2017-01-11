import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
	
		int k[] = new int[N];
		int s[] = new int[N];
		
		int d = in.nextInt(); //number of rotations
		
		for (int i = 0; i < k.length; i++) {
			k[i] = in.nextInt();
			s[i] = k[i];
		}
		
		d = d%N;
		
		for (int i = 0; i < N; i++) {
			int t = i+d;
			t = (t >=N ? t-N : t);
			s[i] = k[t];
			System.out.print(s[i] + " ");
		}
	}
}
