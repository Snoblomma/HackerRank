import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		long A[] = new long[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}

		long res = n;

		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j]) {
					long min = Math.abs(i-j);
					if (min < res) {
						res = min;
					}
				}
			}
		}

		if (res == n) {
			System.out.println(-1);
		} else {
			System.out.println(res);
		}
	}
}
