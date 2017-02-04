import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();//size of array
		
		int a[] = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		
		if(N % 2 == 0){
			System.out.println((a[N/2]+a[N/2-1])/2);
		}
		else if(N % 2 ==1){
			System.out.println(a[N/2]);
		}
	}
}
