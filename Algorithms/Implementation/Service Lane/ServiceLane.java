import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();// length of freeway
		int T = in.nextInt();//test cases
		
		int array[] = new int[N];//width array
		
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		
		for (int k = 0; k < T; k++) {
			//Calvin has to pass through all segments from index i to index j
			int i = in.nextInt();
			int j = in.nextInt();
			System.out.println(vehicle(array, i,j));
		}
	}

	private static int vehicle(int[] array, int i, int j) {
		int v = 3;
		
		for (int k = i; k <= j; k++) {
			if(array[k] < v){
				v = array[k];
			}
		}	
		return v;
	}	
}
