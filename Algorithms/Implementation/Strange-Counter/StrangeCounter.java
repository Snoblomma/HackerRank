import java.util.*;

public class Solution {

    	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();
		
		long start = 1;
		long end = 3;
		long switcher = 3;
		
		doThis(start, end, switcher, t);
		
	}

	private static void doThis(long start, long end, long switcher, long t) {
		if(t >= start && t <= end){
			System.out.println(switcher - t + start);
		}
		else{
			switcher*=2;
			start = end+ 1;
			end += switcher;
			doThis(start, end, switcher, t);
		}
	}
}
