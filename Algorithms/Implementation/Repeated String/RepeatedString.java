package Algorithms;

import java.util.*;

public class RepeatedString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		long n = in.nextLong();

		long counter = 0;
		long d = n / s.length();
		long k = n % s.length();

		for (int i = 0; i < s.length(); i++) {
			char t = s.charAt(i);
			if (t == 'a') {
				counter++;
			}
		}

		counter = counter * d;

		for (int i = 0; i < k; i++) {
			char t = s.charAt(i);
			if (t == 'a') {
				counter++;
			}
		}

		System.out.println(counter);
	}
}
