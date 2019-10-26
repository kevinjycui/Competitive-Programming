import java.util.LinkedList;
import java.util.Scanner;

public class ccc12s5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

		int [][] graph = new int [r][c];

		int k = sc.nextInt();

		for (int i=0; i<k; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			graph[x][y] = 1;
		}

		int [][] dp = new int [r][c];
		
		dp[0][0] = 1;

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (graph[i][j] == 1) continue;
				if (i-1>=0 && graph[i-1][j] != 1) {
					dp[i][j] += dp[i-1][j];
				}
				if (j-1>=0 && graph[i][j-1] != 1) {
					dp[i][j] += dp[i][j-1];
				}
			}
		}
		
		System.out.println(dp[r-1][c-1]);

	}

}