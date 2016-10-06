package Algorithms;

import java.text.DecimalFormat;
import java.util.*;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int positive = 0;
		int negative = 0;
		int zeroes = 0;

		String pos, neg, zer;

		for (int i = 0; i < N; i++) {
			int next = in.nextInt();
			if (next > 0)
				positive++;
			else if (next < 0)
				negative++;
			else if (next == 0)
				zeroes++;
		}

		pos = new DecimalFormat("#0.000000").format((double) positive / N);
		neg = new DecimalFormat("#0.000000").format((double) negative / N);
		zer = new DecimalFormat("#0.000000").format((double) zeroes / N);

		System.out.println(pos + "\n" + neg + "\n" + zer);

	}
}
