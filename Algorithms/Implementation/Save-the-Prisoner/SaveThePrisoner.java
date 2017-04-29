import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			long n = in.nextLong(); // number of prisoners
			long m = in.nextLong(); // number of sweets

			m = m % n;
			
			if(m==0){m = n;}

			long s = in.nextLong(); // the prisoner id to start
			long id = s;
			id = s + m -1 ;
			if (id > n) {
				id = id - n;
			}
			System.out.println(id);
		}
	}
}
