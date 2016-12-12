import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		
		quickSort(ar);
	}
	
	
	private static int[] quickSort(int[] ar){
		int pivot = ar[0];
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> equal = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < pivot) {
				left.add(ar[i]);
			} else if (ar[i] == pivot) {
				equal.add(ar[i]);
			} else if (ar[i] > pivot) {
				right.add(ar[i]);
			}
		}
		
		
		if(left.size() > 1){	
				int[] l = quickSort(left.stream().mapToInt(i->i).toArray());
				left.clear();
				for (int i = 0; i < l.length; i++) {
					left.add(l[i]);
				}
			}
		if(right.size() > 1){
			int[] r = quickSort(right.stream().mapToInt(i->i).toArray());
			right.clear();
			for (int i = 0; i < r.length; i++) {
				right.add(r[i]);
			}
		}
		
		
		left.addAll(equal);
		left.addAll(right);

		int[] ar1 = left.stream().mapToInt(i->i).toArray();
		
		for (int i = 0; i < ar.length; i++) {
			
			System.out.print(ar1[i] + " ");
		}
		
		System.out.println();
		
		return ar1;	
	}
}
