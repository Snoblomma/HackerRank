import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// array size
		int d = in.nextInt();// desirable distance

		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int count = 0;

		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length-1; j++) {
				if (a[j] - a[i] == d) {
					for (int k = j+1; k < a.length; k++) {
						if(a[k]-a[j]==d){
							//System.err.println(a[i] + " " + a[j] + " " + a[k]);
							count++;
						}
					}				
				}
			}
		}

		System.out.println(count);
	}
}
