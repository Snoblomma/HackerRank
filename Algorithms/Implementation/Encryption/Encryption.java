import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		// removing spaces
		String d = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				d += s.charAt(i);
			}
		}

		int rows = (int) Math.sqrt(d.length());
		int columns = (rows * rows == d.length() ? rows : rows+1);
		
		if(rows*columns < d.length()){
			while(rows*columns < d.length()){
				if(rows < columns){
					rows++;
				}
				else if(rows == columns){
					columns++;
				}
			}
		}
		
		char m[][] = new char[rows][columns];

		int k = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (k < d.length()) {
					m[i][j] = d.charAt(k);
					k++;
				} else {
					break;
				}
			}
		}

		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {
				if(Character.isLetter(m[i][j])){
					System.out.print(m[i][j]);
				}
				else{break;}
			}
			System.out.print(" ");
		}		
	}
}
