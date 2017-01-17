import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();//number of arrays
		
		ArrayList<String[]> s = new ArrayList<String[]>();
		
		for (int i = 0; i <= N; i++) {
			String d = in.nextLine();
			String a[] = d.split(" ");
			s.add(a);
		}
		
		
		
		int q = in.nextInt();//number of queries
		for (int i = 0; i < q; i++) {
			int x = in.nextInt();//number of line;
			int y = in.nextInt();//number of position;
			
			if(s.get(x).length > y){
				System.out.println(s.get(x)[y]);
			}
			else{
				System.out.println("ERROR!");
			}
		}
	}
}
