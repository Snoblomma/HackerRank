import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = s.length();
		int count = 0;

		for (int i = 0; i < n; i++) {
			
			if (i%3 == 0 || i % 3 == 2) {
				if (s.charAt(i) != 'S') {
					count++;
				}
			} 
			
			else if (i%3 == 1) {
				if (s.charAt(i) != 'O') {
					count++;
				}
			} 
		}
		System.out.println(count);
	}
}
