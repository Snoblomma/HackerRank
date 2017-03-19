import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();//qeries
		
		for (int i = 0; i < q; i++) {
			int catA = in.nextInt();
			int catB = in.nextInt();
			int mouseC = in.nextInt();
			
			if(Math.abs(mouseC-catB) == Math.abs(mouseC-catA)){
				System.out.println("Mouse C");
			}
			else if(Math.abs(mouseC-catB) > Math.abs(mouseC-catA)){
				System.out.println("Cat A");
			}
			else if(Math.abs(mouseC-catB) < Math.abs(mouseC-catA)){
				System.out.println("Cat B");
			}
		}	
	}
}
