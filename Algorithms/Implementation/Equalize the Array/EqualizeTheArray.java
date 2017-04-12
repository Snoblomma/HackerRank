import java.util.*;

public class Solution {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++){
			a[i] = in.nextInt();
		}
		
		//list of original numbers
		ArrayList<Integer> elements = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(!elements.contains(a[i])){
				elements.add(a[i]);
			}
		}
		
		Arrays.sort(a);		
		
		//array to count number of instances
		int s[] = new int[elements.size()];
		
		int k = 0;
		int p = 1;
		
		for (int i = 0; i < a.length-1; i++) {		
			if(a[i]==a[i+1]){
				p++;
			}
			else if (a[i]!= a[i+1]){
				s[k] = p;				
				p = 1;
				k++;
			}
		}
		s[s.length-1] = p;
		
		
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum+=s[i];
		}
		
		Arrays.sort(s);
		
		System.out.println(sum - s[s.length-1]);
	}
}
