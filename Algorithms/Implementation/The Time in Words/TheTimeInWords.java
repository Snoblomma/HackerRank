import java.util.*;

public class Solution {

    public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int h = in.nextInt();// hours
		int m = in.nextInt();// minutes

		String k = "";
		if (m == 0) {
			k = toH(h) + " o' clock";
		} else if (m == 1) {
			k = "one minute past " + toH(h);
		} else if (m == 15) {
			k = "quarter past " + toH(h);
		} else if (m == 45) {
			k = "quarter to " + toH(next(h));
		} else if (m < 30) {
			k = toMin(m) + " minutes past " + toH(h);
		} else if (m == 30) {
			k = "half past " + toH(h);
		} else if (m > 30) {
			k = toMin(60 - m) + " minutes to " + toH(next(h));
		}
		System.out.println(k);
	}

	private static int next(int h) {
		int res = 0;
		switch (h) {
		case 1:
			res = 2;
			break;
		case 2:
			res = 3;
			break;
		case 3:
			res = 4;
			break;
		case 4:
			res = 5;
			break;
		case 5:
			res = 6;
			break;
		case 6:
			res = 7;
			break;
		case 7:
			res = 8;
			break;
		case 8:
			res = 9;
			break;
		case 9:
			res = 10;
			break;
		case 10:
			res = 11;
			break;
		case 11:
			res = 12;
			break;
		case 12:
			res = 1;
			break;

		default:
			break;
		}
		return res;
	}

	private static String toMin(int m) {
		String res = "";
		if (m <= 12) {
			res = toH(m);
		} else {
			switch (m) {
			case 13:
				res = "thirteen";
				break;

			case 14:
				res = "fourteen";
				break;
			case 16:
				res = "sixteen";
				break;
			case 17:
				res = "seventeen";
				break;
			case 18:
				res = "eightteen";
				break;
			case 19:
				res = "nineteen";
				break;
			case 20:
				res = "twenty";
				break;
			case 21:
				res = "twenty one";
				break;
			case 22:
				res = "twenty two";
				break;
			case 23:
				res = "twenty three";
				break;
			case 24:
				res = "twenty four";
				break;
			case 25:
				res = "twenty five";
				break;
			case 26:
				res = "twenty six";
				break;
			case 27:
				res = "twenty seven";
				break;
			case 28:
				res = "twenty eight";
				break;
			case 29:
				res = "twenty nine";
				break;
			default:
				break;
			}
		}
		return res;
	}

	private static String toH(int h) {
		String res;
		switch (h) {
		case 1:
			res = "one";
			break;
		case 2:
			res = "two";
			break;
		case 3:
			res = "three";
			break;
		case 4:
			res = "four";
			break;
		case 5:
			res = "five";
			break;
		case 6:
			res = "six";
			break;
		case 7:
			res = "seven";
			break;
		case 8:
			res = "eight";
			break;
		case 9:
			res = "nine";
			break;
		case 10:
			res = "ten";
			break;
		case 11:
			res = "eleven";
			break;
		case 12:
			res = "twelve";
			break;

		default:
			res = "one";
		}
		return res;
	}
}
