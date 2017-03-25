import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();// tests

		for (int i = 0; i < t; i++) {
			String d = in.next();
			System.out.println(separate(d));
		}
	}

	private static String separate(String d) {
		int s = d.length();

		for (int i = d.length()/2; i > 0; i--) {
			String r = d.substring(0, i);			
			long start = Long.valueOf(d.substring(0, i));
			long counter = start;
			while(r.length() < s){
				r += String.valueOf(counter+1);
				counter++;
			}
			if(d.equals(r)){
				return "YES " + start;
			}
		}
		return "NO";
	}
}
