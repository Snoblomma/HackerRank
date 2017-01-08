import java.util.*;

public class Solution {

    	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int T = in.nextInt();// number of test cases

		for (int i = 0; i < T; i++) {

			String S = in.next();
			System.out.println(anagrammaticPairs(S));

		}

	}

	private static int anagrammaticPairs(String s) {
		int pairs = 0;

		for (int i = 0; i < s.length() - 1; i++) { // we dont need N = 0 & N = 1

			int N = s.length() - i;

			String p[] = new String[N];

			for (int j = 0; j < N; j++) {
				p[j] = s.substring(j, i + j + 1);
				p[j] = sortString(p[j]);				
			}

			int current = 0;
			
			for (int j = 0; j < p.length-1; j++) {
				for (int k = j+1; k < p.length; k++) {
					if (p[j].equals(p[k])) {
						current++;
					}
				}			
			}			
			pairs += current;
		}
		return pairs;
	}

	private static String sortString(String original) {
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
		return sorted;
	}   
}
