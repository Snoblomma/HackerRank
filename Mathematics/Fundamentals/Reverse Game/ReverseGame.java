import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int K = in.nextInt();
			System.out.println(getPosition(N, K));
		}
	}

	private static int  getPosition(int N, int K) {
		int array[] = new int[N];
		//filling array:
		for (int i = 0; i < array.length; i++) {
			array[i] = (i%2 == 0 ? N-1-i/2 : i/2);		
            if(array[i] == K){
				return i;
			}
		}
		return 0;
	}
}
