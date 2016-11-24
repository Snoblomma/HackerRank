import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); //number of people
		
		int countOdd = 0;
		
		int t[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			t[i] = in.nextInt();
			if(t[i]%2 ==1){
				countOdd++;
			}
		}
		
		if(countOdd %2==1){
			System.out.println("NO");
		}
		else{
			System.out.println(minimal(t));	
		}
	}

	private static String minimal(int[] t) {
		int count = 0;
		for (int i = 0; i < t.length; i++) {
			if(i== t.length-1){
				if(t[i]%2 == 1 && t[i-1]%2==1){
					t[i]++;
					t[i-1]++;
					count+=2;
				}
				else if(t[i]%2 == 1 && t[i-1]%2==0){
					return "NO";
				}
			}
			else if(t[i]%2==1){
				t[i]++;
				t[i+1]++;
				count+=2;
			}
		}
		return String.valueOf(count);
	}
}
