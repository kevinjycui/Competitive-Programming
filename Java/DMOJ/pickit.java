import java.util.Arrays;
import java.util.Scanner;

public class pickit {
	
	static int [][] dp;
	static int [] val;
	
	static int pick(int l, int r) {
				
		if (l == r) return 0;
		if (dp[l][r] != -1) return dp[l][r];
		
		int max = 0;
				
		for (int i=l+1; i<r; i++)
			max = Math.max(max, val[l] + val[i] + val[r] + pick(l, i) + pick(i, r));
		
		dp[l][r] = max;
		
		return dp[l][r];
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;

			val = new int [n];

			for (int i=0; i<n; i++) 
				val[i] = sc.nextInt();
			
			dp = new int [n][n];
			
			for (int i=0; i<n; i++)
				Arrays.fill(dp[i], -1);
			
			pick(0, n-1);
			
			System.out.println(dp[0][n-1]);
			
		}
	}

}