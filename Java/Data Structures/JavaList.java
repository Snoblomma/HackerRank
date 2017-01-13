import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}
	
		int Q = in.nextInt(); //queries
		
		for (int i = 0; i < Q; i++) {
			String query = in.next();
			
			if(query.equals("Insert")){
				int index = in.nextInt();
				int element = in.nextInt();
				list.add(index, element);
			}
			else if(query.equals("Delete")){
				int index = in.nextInt();
				list.remove(index);
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
	}
}
