import java.util.*;

public class Solution {

	public static int B, H;
	public static boolean flag = initializeClassVariable();

	public static boolean initializeClassVariable() {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();
		if (B <= 0 || H <= 0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			return false;
		}
		return true;
	}
  
  public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
