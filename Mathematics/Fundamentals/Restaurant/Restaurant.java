import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			int min = (a < b ? a : b);
			int max = (a == min ? b : a);
			
			int res = min*max;
			for (int j = min; j > 0; j--) {
				if(min % j == 0 && max % j ==0){
					res = (min*max)/(j*j);
					break;
				}
			}
			System.out.println(res);
		}
	}
}
