import java.util.*;

public class Solution {
   public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int K = in.nextInt();

		int a[] = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		System.out.println(getNumber(a, K));

	}

	private static int getNumber(int[] a, int k) {
		int res = 0;
		int start = 0;
		int prevStart = -1;
		
		while (start < a.length) {
			
			int s = (start + k - 1 < a.length ? start + k - 1 : a.length-1);
					
			if (a[s] == 1) {
				res++;
				prevStart = start;
				start = s+k;
			} 
			
			
			else if (a[s] == 0) {
				boolean found = false;
				
				for (int i = s; i > prevStart; i--) {
					if (a[i] == 1) {
						found = true;
						res++;
						prevStart = start;
						start = i + k;
						break;
					}
				}

				if (found == false) {
					return -1;
				}
			}
		}

		return res;
	}
}
