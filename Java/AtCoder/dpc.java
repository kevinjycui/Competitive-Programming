import java.util.Scanner;

public class dpc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] a = new int [n];
		int [] b = new int [n];
		int [] c = new int [n];
		
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		int [][] dp = new int [n][3];
		
		dp[0][0] = a[0];
		dp[0][1] = b[0];
		dp[0][2] = c[0];
		
		for (int i=1; i<n; i++) {
			dp[i][0] = Math.max(dp[i-1][1] + a[i], dp[i-1][2] + a[i]);
			dp[i][1] = Math.max(dp[i-1][0] + b[i], dp[i-1][2] + b[i]);
			dp[i][2] = Math.max(dp[i-1][0] + c[i], dp[i-1][1] + c[i]);
		}
		
		int max = 0;
		
		for (int i=0; i<3; i++)
			max = Math.max(max, dp[n-1][i]);
		
		System.out.println(max);
		
	}

}
