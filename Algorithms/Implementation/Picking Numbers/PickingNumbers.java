import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// suze of array

		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		Arrays.sort(a);
		int res = 0;
		int j = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int k = 1;
			j = i + 1;
			if (j < a.length) {
				while (a[j] - a[i] <= 1 && j < a.length) {
					k++;
					if(j+1 < a.length){
                        j++;
          }
					else{
               break;
          }
				}
			}
			else{break;}
			
			if (res < k) {
				res = k;
			}
		}
		System.out.println(res);
	}
}
