import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
   		for (int i = 1; i < ar.length; i++) {
			if (ar[i] >= ar[i - 1]) {
				printArray(ar);
			}
			else if(ar[i] < ar[i-1]){
				for (int j = i; j > 0; j--) {
					if(ar[j] < ar[j-1]){
						int k = ar[j];
						ar[j]=ar[j-1];
						ar[j-1] = k;
					}
				}
				printArray(ar);
			}
		}
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
