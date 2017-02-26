import java.util.*;

public class Solution {

    public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); //number of teams
		int M = in.nextInt(); //number of topics
		
		int maxTopics = 0;
		int teams = 0;

		int s[][] = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String k = in.next();
			for (int j = 0; j < M; j++) {
				s[i][j] = Integer.valueOf(k.substring(j, j+1));
			}
		}
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				
				int size=0;
				
				for (int j2 = 0; j2 < M; j2++) {
					if(s[i][j2]==1 || s[j][j2] == 1){
						size++;
					}
				}
				
				if(size > maxTopics){
					maxTopics = size;
					teams = 1;
				}
				else if(size == maxTopics){
					teams++;
				}				
			}
		}
		
		System.out.println(maxTopics);
		System.out.println(teams);
	}
}
