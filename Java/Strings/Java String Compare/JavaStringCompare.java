import java.io.*;
import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String h = in.nextLine();
		
		int d = in.nextInt();
		
		String[] s = new String[h.length()+1-d];
		
		String min = h.substring(0, d);
		String max = h.substring(0, d);
		
		for (int i = 0; i < s.length; i++) {
			s[i] = h.substring(i, i+d);
			if(min.compareTo(s[i]) > 0){
				min = s[i];
			}		
			if(max.compareTo(s[i]) < 0){
				max = s[i];
			}
		}		
		System.out.println(min);
		System.out.println(max);
	}
}
