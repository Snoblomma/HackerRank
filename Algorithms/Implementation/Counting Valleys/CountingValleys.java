import java.util.*;

public class Solution {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int array[] = new int[N+1];
		array[0] = 0;
		String s = in.next();
		int valleys = 0;
		for (int i = 1; i <= N ; i++) {
			char c = s.charAt(i-1);
			if(c == 'U'){
				array[i] = array[i-1]+1;
			}
			else if(c == 'D'){
				array[i] = array[i-1]-1;
			}
			
			if(array[i] == -1 && array[i-1] == 0){
				valleys++;
			}
		}
		
		System.out.println(valleys);
	}
}
