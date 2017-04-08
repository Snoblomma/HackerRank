import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int n1 = (n%2 == 0 ? n/2 : (n/2)+1);
		int m1 = (m%2 == 0 ? m/2 : (m/2)+1);
		
		System.out.println(n1*m1);
	}
}
