import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int counter = 1;
		
		for (int i = 0; i < s.length(); i++) {
			char k = s.charAt(i);
			if(Character.isUpperCase(k)){
				counter++;
			}
		}
		
		System.out.println(counter);
	}
		
}
