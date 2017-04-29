import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long a[] = new long[5];

        for (int i = 0; i < a.length; i++) {
        	a[i] = in.nextLong();
		}
        
        long f[] = new long[5];
        long maxsum = 0;
        for (int i = 0; i < a.length; i++) {
        	long res = 0;
			for (int j = 0; j < a.length; j++) {		
				if(j!=i){
					res+=a[j];
				}
			}

			f[i] = res;
			
			if(res > maxsum){maxsum = res;}
		}
        
        long minsum = maxsum;
        for (int i = 0; i < f.length; i++) {
			if(f[i] < minsum){
				minsum = f[i];
			}
		}
        
        System.out.println(minsum + " " + maxsum);
	}
}
