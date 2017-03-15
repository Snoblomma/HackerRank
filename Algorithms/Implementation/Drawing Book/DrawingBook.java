import java.util.*;

public class Solution {

    public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();//pages in book
		int p = in.nextInt();//page to open
		
		if(p==1){System.out.println(0);}
		else{
			int total = n/2+1;
			
			int flip = p/2;
			System.err.println("total " + total + " , flip " + flip);
			int r = ((total - flip -1) > flip ? flip : total - flip-1);
			System.err.println("t -f" + (total - flip-1));
			System.out.println(r);
		}	
	}
}
