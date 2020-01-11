import java.util.Scanner;

public class cco18p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] geese = new int [n+1];
		int [] hawks = new int [n+1];
		
		String s = sc.next();
		for (int i=1; i<=n; i++)
			geese[i] = sc.nextInt();
		
		String t = sc.next();
		for (int j=1; j<=n; j++)
			hawks[j] = sc.nextInt();
		
		int [][] dp = new int [n+1][n+1];
						
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				if ((s.charAt(i-1) > t.charAt(j-1) && geese[i] > hawks[j]) || (s.charAt(i-1) < t.charAt(j-1) && geese[i] < hawks[j]))
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + geese[i] + hawks[j]);
			}
		}
		
		System.out.println(dp[n][n]);		
		
		
	}

}
