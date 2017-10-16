import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int count[] = new int[26];
		
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		//trasforming Unicode character to 0-25
		for(int i = 0; i < s.length(); i++){
			int d = Character.getNumericValue(s.charAt(i)) - 10;
			count[d]++;
		}	
		System.out.println(fetch(count));
	}

	private static String fetch(int[] count) {
		boolean one = false;
		for (int i = 0; i < count.length; i++) {
			if(count[i]%2 == 1 && one == true){
				return "NO";
			}
			else if(count[i]%2 == 1 && one == false){
				one = true;
			}
		}	
		return "YES";
	}
}
