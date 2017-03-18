import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long s[] = new long[n];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = in.nextLong();
		}
		
		long min = s[0];
		long max = s[0];
		int mincount = 0;
		int maxcount = 0;
		
		for (int i = 1; i < s.length; i++) {
			if(s[i] < min){
				min = s[i];
				mincount++;
			}
			else if(s[i] > max){
				max = s[i];
				maxcount++;
			}
		}		
		System.out.println(maxcount + " " + mincount);	
	}
}
