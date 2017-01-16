import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				int k[] = new int[j - i + 1];
				for (int l = 0; l < k.length; l++) {
					k[l] = a[l + i];
				}

				int s = 0;
				for (int l1 = 0; l1 < k.length; l1++) {
					s += k[l1];
				}
				if (s < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
