import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt(); // number of cases
		
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			char[][] c = new char[N][N];
			
			for (int j = 0; j < N; j++) {
				String d = in.next();
				for (int k = 0; k < N; k++) {
					c[j][k] = d.charAt(k);
				}
			}		
			System.out.println(canIt(c));
		}
		
	}

	private static String canIt(char[][] c) {
		//sorting rows first
		for (int i = 0; i < c.length; i++) {
			char[] d = new char[c.length];
			for (int j = 0; j < c.length; j++) {
				d[j] = c[i][j];
			}		
			
			Arrays.sort(d);
			
			for (int j = 0; j < d.length; j++) {
				c[i][j] = d[j];
			}			
		}		
		
		//going trough columns, if column is not sorted, then no
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if(c[j][i] > c[j+1][i]){
					return "NO";
				}
			}					
		}		
		return "YES";
	}
}
