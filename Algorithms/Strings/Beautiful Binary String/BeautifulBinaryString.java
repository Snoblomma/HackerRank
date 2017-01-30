import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] array = new int[n];
		int count = 0;
		String m = in.next();

		for (int i = 0; i < n; i++) {
			array[i] = Integer.valueOf(m.substring(i, i + 1));
		}

		if (n < 3) {
			System.out.println(0);
		}

		else if (n == 3) {
			if (array[0] == 0 && array[1] == 1 && array[2] == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

		else if (n > 3) {
			for (int i = 0; i < n - 3; i++) {
				if (array[i] == 0 && array[i + 1] == 1 && array[i + 2] == 0) {
					if (array[i + 3] == 1) {
						array[i + 2] = 1;
						count++;
						
					} else if (array[i + 3] == 0) {
						array[i + 1] = 0;
						count++;
					}
				}
			}

			if (array[n - 3] == 0 && array[n - 2] == 1 && array[n - 1] == 0) {
				if (array[n - 4] == 0) {
					array[n - 2] = 0;
					count++;

					
				} else if (array[n - 4] == 1) {
					array[n - 3] = 1;
					count++;
				}
			}
		}
		System.out.println(count);	
	}
}
