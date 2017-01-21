import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt()-1;
        int date = in.nextInt();
        int year = in.nextInt();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, date);
        
        int d =  calendar.get(Calendar.DAY_OF_WEEK);
        String f = "";
        
        switch (d) {
			case 1: f = "SUNDAY"; break;
			case 2: f = "MONDAY"; break;
			case 3: f = "TUESDAY"; break;
			case 4: f = "WEDNESDAY"; break;
			case 5: f = "THURSDAY"; break;
			case 6: f = "FRIDAY"; break;
			case 7: f = "SATURDAY"; break;
			default: break;
		}        
    System.out.println(f);
	}
}
