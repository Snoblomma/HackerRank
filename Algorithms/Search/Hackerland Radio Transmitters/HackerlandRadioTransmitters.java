import java.util.*;

public class Solution {

   		public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        int[] x = new int[n];
     
        
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        
        Arrays.sort(x);
        int res = 0;
        int start = 0;
        int mid = 0;
        int end = 0;
        boolean midDone = false;
        
        while(start < x.length && mid < x.length && end < x.length){
        	if(midDone == false){
        		if(x[mid] - x[start] > k){
        			mid = mid-1;
        			end = mid;
        			midDone = true; 
        		}
        		else if(x[mid] - x[start] <= k){
        			mid++;
        		}
        	}
        	else if(midDone == true){
        		if(x[end] - x[mid] > k){
        			start = end;
        			mid = start;
        			midDone = false;
        			res++;
        		}
        		else if(x[end] - x[mid] <= k){
        			end++;
        		}
        	}
        }
        res++;          
        System.out.println(res);
	}
}
