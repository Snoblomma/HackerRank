import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String s = in.next();// initial string
		String t = in.next();// desired final string
		int k = in.nextInt();// number of operations

		System.out.println(isPossible(s, t, k));

	}

	private static String isPossible(String s, String t, int k) {

		if(s.equals(t) && s.length()+t.length() <=k){
			return "Yes";
		}
        else if(s.equals(t) && k%2 == 0){
			return "Yes";
		}
		else if(s.equals(t) && s.length()+t.length() >k){
			return "No";
		}
		
		int m = (s.length() > t.length() ? t.length() : s.length());
		int res = 0;

		boolean done = false;
		
		for (int i = 0; i < m; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				res = s.substring(i).length() + t.substring(i).length();
				done = true;
				break;
			}
		}
		
		if(done == false){
			res = Math.abs(s.length()- t.length());
		}

		if (res <= k && (k-res)%2==0) {
			return "Yes";
		} 
        else if(res == s.length()+t.length() && res <=k){
			return "Yes";
		}
        else if(s.length() + t.length() <= k){
			return "Yes";
		}
        else {
			return "No";
		}
	}
}
