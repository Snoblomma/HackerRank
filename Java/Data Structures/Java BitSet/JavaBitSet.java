import java.util.*;

public class Solution {

    	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		BitSet B1 = new BitSet(N);
		BitSet B2 = new BitSet(N);
		
		int M = in.nextInt(); //queues
		
		for (int i = 0; i < M; i++) {
			String command = in.next();
			int x = in.nextInt();
			int y = in.nextInt();
			
			switch (command) {
			case "AND":	
				if(x == 1 && y==1){B1.and(B1);}
				else if(x == 1 && y==2){B1.and(B2);}
				else if(x == 2 && y==1){B2.and(B1);}
				else if(x == 2 && y==2){B2.and(B2);}
				break;
			case "OR":	
				if(x == 1 && y==1){B1.or(B1);}
				else if(x == 1 && y==2){B1.or(B2);}
				else if(x == 2 && y==1){B2.or(B1);}
				else if(x == 2 && y==2){B2.or(B2);}
				break;
			case "XOR":	
				if(x == 1 && y==1){B1.xor(B1);}
				else if(x == 1 && y==2){B1.xor(B2);}
				else if(x == 2 && y==1){B2.xor(B1);}
				else if(x == 2 && y==2){B2.xor(B2);}
				break;
			case "FLIP":	
				if(x == 1){B1.flip(y);}
				else if(x == 2){B2.flip(y);}
				break;
			case "SET":	
				if(x == 1){B1.set(y);}
				else if(x == 2){B2.set(y);}
				break;			
			default:
				break;
			}			
			System.out.println(B1.cardinality() + " " + B2.cardinality());
		}
	}
}
