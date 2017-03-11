import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();// dollars given
			int c = in.nextInt();// cost of chocolate
			int m = in.nextInt();// wrappers to exchange
			int res = count(n, c, m);
			System.out.println(res);
		}

	}

	private static int count(int money, int price, int exchPrice) {
		int res = 0;
		int wCount = 0;
		int bought = money/price;
		money -= bought*price;
		wCount = bought;
		res = bought;
		
		while(wCount >= exchPrice){			
			bought = wCount/exchPrice;
			wCount -= bought*exchPrice;
			wCount += bought;
			res +=bought;
		
		}
		return res;
	}
}
