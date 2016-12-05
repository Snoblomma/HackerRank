import java.util.*;

public class Solution {

    	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int e = 100;
        
        int point = 0;
        do {
        	point = (point+k)%n;
        	e = (c[point] == 1 ? e-3 : e-1);
        }
        while(point!=0);
   
        System.out.println(e);
    }
}
