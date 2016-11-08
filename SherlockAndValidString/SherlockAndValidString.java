import java.io.*;
import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String d = in.next();

		int[] c = new int[26];

		for (int i = 0; i < d.length(); i++) {
			int k = Character.getNumericValue(d.charAt(i)) - 10;
			c[k]++;
		}
		    
        System.out.println(canBeValid(c));

	}

	private static String canBeValid(int[] c) {

		if (isValid(c)) {
			return "YES";
		}

		else {
			for (int i = 0; i < c.length; i++) {
				c[i]--;
				if (isValid(c)) {
					System.err.println("removing " + i);
					return "YES";
				} else {
					c[i]++;
				}
			}
		}

		return "NO";
	}

	private static boolean isValid(int[] c) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < c.length; i++) {
			if (c[i] != 0) {
				list.add(c[i]);
			}
		}
        
		for (int i = 0; i < list.size() - 1; i++) {
			if (!list.get(i).equals(list.get(i + 1))) {
				return false;
			}
		}

		return true;
	}
}
