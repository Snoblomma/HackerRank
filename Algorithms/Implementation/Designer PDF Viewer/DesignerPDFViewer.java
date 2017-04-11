import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		int height[] = new int[26];
		
		for (int i = 0; i < 26; i++) {
			height[i] = in.nextInt();
		}
		
		String s = in.next();
		
		int length = s.length();
		int maxh = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int d = Character.getNumericValue(s.charAt(i)) - 10;
			System.err.println(height[d]);
			if(height[d] > maxh){
				maxh = height[d];
			}
		}		
		System.out.println(maxh*length);
	}
}
