import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

		int s = in.nextInt();
		int t = in.nextInt();

		int min = Math.min(s, t);
		int max = Math.max(s, t);

		int a = in.nextInt(); // apple tree
		int b = in.nextInt(); // orange tree

		int m = in.nextInt(); // number of apples
		int n = in.nextInt(); // number of oranges

		// apples
		int apples = 0;
		for (int i = 0; i < m; i++) {
			int k = in.nextInt() + a;
			if (k >= min && k <= max) {
				apples++;
			}
		}

		// oranges
		int oranges = 0;
		for (int i = 0; i < n; i++) {
			int k = in.nextInt() + b;
			if (k >= min && k <= max) {
				oranges++;
			}
		}
		
		System.out.println(apples);
		System.out.println(oranges);
	}
}
