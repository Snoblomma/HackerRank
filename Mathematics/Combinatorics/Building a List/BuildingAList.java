import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int l = in.nextInt();
			String s = in.next();
			char[] h = new char[l];
			ArrayList<String> first = new ArrayList<String>();

			for (int j = 0; j < l; j++) {
				first.add(s.substring(j, j));
				h[j] = s.charAt(j);
			}

			HashSet<String> list = new HashSet<String>(); // array for results

			// we need combinations of all sizes
			for (int r = 1; r <= l; r++) {
				ArrayList<String> templist = new ArrayList<String>();
				char data[] = new char[r];
				templist.addAll(combination(h, data, 0, l - 1, 0, r));
				list.addAll(templist);
			}

			List<String> sortedList = new ArrayList<String>(list);
			Collections.sort(sortedList);

			for (int j = 0; j < sortedList.size(); j++) {
				System.out.println(sortedList.get(j));
			}
		}
	}

	private static ArrayList<String> combination(char arr[], char data[], int start, int end, int index, int r) {
		ArrayList<String> list = new ArrayList<String>();

		if (index == r) {
			String s = "";
			for (int j = 0; j < r; j++) {
				s += data[j];
			}

			list.add(s);
			return list;
		}

		for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
			data[index] = arr[i];
			list.addAll(combination(arr, data, i + 1, end, index + 1, r));
		}
		return list;
	}
}
