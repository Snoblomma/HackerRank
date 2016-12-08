import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
    	//putting the smallest element to A[0]
        int min = A[0];
        int point = 0;
    	for (int i = 0; i < A.length; i++) {
			if(A[i] < min){
				min = A[i];
				point = i;
			}
		}
    	
    	int c = A[0];
    	A[0] = min;
    	A[point] = c;
        
    	//sorting
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j > 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
