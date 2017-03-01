import java.util.*;

public class Solution {
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			int t = in.nextInt();
			String[] s = new String[t];
			
			for (int i = 0; i < t; i++) {
				s[i] = in.next();
			}
			
			for(int i = 0;i < t; i++){
				System.out.println(count(s[i]));
			}
		}
	
		private static int count(String string) {
			int res = 0;
			int n = string.length();
			
			for (int i = 0; i < n/2; i++) {
				res += Math.abs(string.charAt(i)-string.charAt(n-1-i));
			}	
			return res;
		}	
}
