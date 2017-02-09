import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = in.next();
		}

		for (int i = 0; i < n; i++) {
			System.out.println(count(s[i]));
		}

	}

	private static int count(String string) {
		
		int count = 0;
		
		ArrayList<Character> array = new ArrayList<Character>();
		
		for (char i = 'a'; i <= 'z'; i++) {
			array.add(i);
		}
		
		for (int i = 0; i < array.size(); i++) {
			if (string.contains(array.get(i).toString())){
				count++;
			}
		}
		
		return count;
	}
}
