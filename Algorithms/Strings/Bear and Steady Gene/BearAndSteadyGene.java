import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();

		int d[] = new int[4];

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				d[0]++;
				break;
			case 'C':
				d[1]++;
				break;
			case 'T':
				d[2]++;
				break;
			case 'G':
				d[3]++;
				break;
			}
		}
		
		System.out.println(stableDNA(d, n, s));

	}

	private static int stableDNA(int[] d, int n, String s) {

		// benchmark:
		int b = n / 4;

		if (d[0] == b && d[1] == b && d[2] == b && d[3] == b) {
			
			return 0;
		}
		
		String z[] = new String[4];
		
		for (int i = 0; i < z.length; i++) {
			z[i] = "\\b([A-Z]*)\\b";
		}

		int g = 0;

		for (int i = 0; i < d.length; i++) {
			if (d[i] > b) {
				int l = d[i] - b; 
				g += l;
				
				switch (i) {
				case 0:
					z[0] = "\\b[A-Z]*(A[A-Z]*){"+l+"}[A-Z]*\\b";
					System.err.println("A changed to " + l);
					break;
				case 1:
					z[1] = "\\b[A-Z]*(C[A-Z]*){"+l+"}[A-Z]*\\b";
					System.err.println("C changed to " + l);
					break;
				case 2:
					z[2] = "\\b[A-Z]*(T[A-Z]*){"+l+"}[A-Z]*\\b";
					System.err.println("T changed to " + l);
					break;
				case 3:
					z[3] = "\\b[A-Z]*(G[A-Z]*){"+l+"}[A-Z]*\\b";
					System.err.println("G changed to " + l);
					break;
				}
			} 
		}
		
		for (int j = g; j < s.length(); j++) {
			for (int i = 0; i < s.length()-j+1; i++) {
			
				String h = s.substring(i, j+i);
				
				//System.out.println("Check: " + h);
			
				if (h.matches(z[0]) && h.matches(z[1]) && h.matches(z[2]) && h.matches(z[3])) {
					//System.out.println("YES!" + h);
					return h.length();
				}
			}
		}

		return 0;
	}
}
