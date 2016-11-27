import java.util.*;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		long array[] = new long[n];
		int s[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = in.nextLong();
		}

		for (int i = 0; i < n; i++) {
			s[i] = (int) (array[i] % k);
		}
		
		
		long f[] = new long[k];
		
		for (int i = 0; i < s.length; i++) {
			int h = s[i];
			f[h]++;
		}
		
		long res= 0 ;
		
		if(f[0] > 0){
			res++;
		}
		for (int i = 1; i <= f.length/2; i++) {
			for (int j = f.length-1; j >= f.length/2; j--) {
				
				System.err.println("Looking at " +i +" " + j);
				
				if(i+j == k){
					System.err.println("yep");
					if(i==j){
						res++;
					}
					else if(f[i]>=f[j]){
						res+=f[i];		
					}
					
					else if(f[j] > f[i]){
						res+=f[j];

					}
				}
			}
		}
		System.out.println(res);
	}
}
