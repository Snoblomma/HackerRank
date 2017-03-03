import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//array size;
		int k = in.nextInt();//max height jump
		int a[] = new int[n];
		int res = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			if(a[i] > k){
				res = res + a[i] - k;
				k = a[i];
			}
		}
		System.out.println(res);
	}
}
