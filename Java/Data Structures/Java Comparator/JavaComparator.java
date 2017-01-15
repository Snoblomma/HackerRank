import java.util.*;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator {
	public int compare(Object o1, Object o2) {
		int p1 = ((Player) o1).score;
		int p2 = ((Player) o2).score;
		String s1 = ((Player) o1).name;
		String s2 = ((Player) o2).name;

		if (p1 > p2) {
			return -1;
		} else if (p1 < p2) {
			return 1;
		} else if (p1 == p2) {
			if (s1.compareTo(s2) > 0) 
			{
				return 1;
			} 
			else if (s1.compareTo(s2) < 0) {
				return -1;
			} 
			else {
				return 0;
			}
		}
		return 0;
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
