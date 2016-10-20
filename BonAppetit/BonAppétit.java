package Algorithms;

import java.util.*;

public class BonAppétit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		int courses[] = new int[n];
		int actual = 0;

		for (int i = 0; i < n; i++) {
			courses[i] = in.nextInt();
			if (i != k) {
				actual += courses[i];
			}
		}

		int bcharged = in.nextInt();

		int dif = bcharged - actual/2;

		if (dif == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(dif);
		}

	}

}
