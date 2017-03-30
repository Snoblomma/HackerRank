import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long res = 0;
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}	
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			res+= a[a.length-1-i]*Math.pow(2, i);
		}		
		System.out.println(res);
	}
}
