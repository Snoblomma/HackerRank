package Algorithms;

import java.util.*;

public class Staircase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for (int i = 0; i < N; i++) {
			String string;
			String space = "";
			String sharp = "";

			for (int j = i; j < N - 1; j++) {
				space += " ";
			}
			for (int k = i + 1; k > 0; k--) {
				sharp += "#";
			}

			string = space + sharp;

			System.out.println(string);

		}

	}

}
