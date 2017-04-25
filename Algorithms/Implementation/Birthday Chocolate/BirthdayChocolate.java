import java.util.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        int count = 0;
        
        if(squares.length==1){
        	if(squares[0] == d){
        		count++;
        	}      	
        }
        else{
            for (int i = 0; i <= squares.length-m; i++) {
    			int t = 0;
    			for (int j = i; j < i+m; j++) {
    				t+=squares[j];
    			}
    			System.err.println("t = "+  t);
    			if(t == d){
    				System.err.println("added " + i + " " + (i+m-1));
    				count++;
    			}
    		}
        }       
        return count; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
