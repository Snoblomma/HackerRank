import java.util.*;
import java.util.regex.*;

public class Solution{
   public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String line = in.nextLine();

			String pattern = "<([a-zA-Z0-9_ \\p{P}\\p{S}]+)>(?:([a-zA-Z0-9_ \\p{P}\\p{S}][^<>]+)<\\/\\1>)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(line);

			if (m.find()) {
				System.out.println(m.group(2));
				while (m.find()) {
					System.out.println(m.group(2));
				}

			} else {
				System.out.println("None");
			}
			testCases--;
		}
	}
}
