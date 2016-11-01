import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		String[][] s = new String[t][2];

		for (int i = 0; i < t; i++) {
			String string = in.next();
			s[i][0] = string.substring(0, string.length() / 2);
			s[i][1] = string.substring(string.length() / 2);
		}

		for (int i = 0; i < t; i++) {
			System.out.println(count(s[i][0], s[i][1]));
		}

	}

	private static int count(String s1, String s2) {
		int res = 0;
		
		if(s1.length() != s2.length()){
			return -1;
		}
		else{
			char S1[] = new char[s1.length()];
			for (int i = 0; i < s1.length(); i++) {
				S1[i] = s1.charAt(i);
			}
			
			char S2[] = new char[s2.length()];
			for (int i = 0; i < s2.length(); i++) {
				S2[i] = s2.charAt(i);
			}
			
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if(S1[i] == S2[j] && S1[i] != '0' && S2[j] != '0'){
						S1[i] =  '0';
						S2[j] = '0';
					}
				}
			}		
			
			for(int i = 0; i < s1.length(); i++){
				if(S1[i] != '0'){
					res++;
				}
			}
			
		}
		
		return res;
	}
}
