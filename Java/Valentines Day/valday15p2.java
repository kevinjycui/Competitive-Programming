import java.util.Scanner;

public class valday15p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(), M = sc.nextInt();
		int [] N = new int [C+1]; int [] K = new int [C+1];
		
		for (int i=1; i<=C; i++) {
			N[i] = sc.nextInt(); K[i] = sc.nextInt();
		}
		
		int [][] dp = new int [C+1][M+1];
		
		for (int i=1; i<=C; i++) {
			for (int j=1; j<=M; j++) {
				if (j>=K[i]) dp[i][j] = Math.max(dp[i-1][j], N[i]+dp[i-1][j-K[i]]);
				else dp[i][j] = dp[i-1][j];
				
			}
		}
		System.out.println(dp[C][M]);
	}

}