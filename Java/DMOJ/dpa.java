import java.util.Arrays;
import java.util.Scanner;

public class dpa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] h = new int [n];
		
		for (int i=0; i<n; i++) 
			h[i] = sc.nextInt();
		
		int [] dp = new int [n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int a=0; a<n; a++) {
			if (a+1<n)
				dp[a+1] = Math.min(dp[a+1], dp[a] + Math.abs(h[a+1]-h[a]));
			if (a+2<n)
				dp[a+2] = Math.min(dp[a+2], dp[a] + Math.abs(h[a+2]-h[a]));
		}
		
		System.out.println(dp[n-1]);
	}

}