import java.util.*;

public class Solution {

		public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
	
			HashSet hs = new HashSet<>();
			
			String a, b;
			
			for (int i = 0; i < t; i++) {
				a = in.next();
				b = in.next();
				String c = a+ " " + b;
				hs.add(c);
				System.out.println(hs.size());
			}	
		}
}
