import java.util.*;

public class Solution {

   public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int grade[] = new int[n];

		for (int i = 0; i < n; i++) {
			grade[i] = in.nextInt();
			if (grade[i] >= 38) {
				grade[i] = round(grade[i]);
			}
			System.out.println(grade[i]);
		}
	}

	private static int round(int i) {
		int res = 0;
		if(i % 5 ==0){
			res = i;
		}
		else {
			int k = (i/5)*5 + 5;
			if(k - i < 3 && k <= 100){
				res = k;
			}
			else{
				res = i;
			}
		}
		return res;
	}
}
