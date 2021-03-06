import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class Solution {
    
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];

      for(int i = 0; i < N; i ++)
         list[i] = Integer.parseInt(in.readLine());
      
      Arrays.sort(list);

		int unfairness = list[N - 1];

		for (int i = 0; i < list.length - K+1; i++) {
			int s = list[i + K - 1] - list[i];
			if (s < unfairness) {			
				unfairness = s;
			}
		}
      
      System.out.println(unfairness);
   }
}
