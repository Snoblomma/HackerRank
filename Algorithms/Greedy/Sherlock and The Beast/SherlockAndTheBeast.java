import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt(); // number of cases

		for (int i = 0; i < T; i++) {

			int N = in.nextInt();
			getNumber(N);
		}
	}

	private static void getNumber(int N) {

		int f = 0;
		int t = 0;

		if (N < 3) {
			System.out.print(-1);
		}

		else if (N % 3 == 0) {
			f = N;
			t = 0;
		}

		else if (N % 3 == 1 && N >= 10) {
			f = N - 10;
			t = 10;
		}

		else if (N % 3 == 2 && N >=5) {
			f = N - 5;
			t = 5;
		}
		else{
			System.out.print(-1);
		}


		for (int j = 0; j < f; j++) {
			System.out.print(5);
		}

		for (int j = 0; j < t; j++) {
			System.out.print(3);
		}
		
		System.out.println();
	}
}
