import java.util.Arrays;
import java.util.Scanner;

public class dpb {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [] h = new int [n];
		
		for (int i=0; i<n; i++) 
			h[i] = sc.nextInt();
		
		int [] dp = new int [n];
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		dp[0] = 0;
		
		for (int a=0; a<n; a++)
			for (int i=1; i<=k; i++) 
				if (a+i<n)
					dp[a+i] = Math.min(dp[a+i], dp[a] + Math.abs(h[a+i]-h[a]));
		
		System.out.println(dp[n-1]);
	}

}
