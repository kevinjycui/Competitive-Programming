import java.util.Arrays;
import java.util.Scanner;

public class dpe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int [] w = new int [N];
		int [] v = new int [N];
		
		int sum_v = 0;
		
		for (int i=0; i<N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
			sum_v += v[i];
		}
		
		long [] dp = new long [sum_v+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for (int i=0; i<N; i++) 
			for (int j=sum_v; j>=0; j--)
				if (j - v[i] >= 0 && dp[j - v[i]] != Integer.MAX_VALUE) 
					dp[j] = Math.min(dp[j], dp[j - v[i]] + w[i]);
		
		int max = 0;

		for (int i=0; i<=sum_v; i++) {
			if (dp[i] <= W && max < i)
				max = i;
		}
		
		System.out.println(max);
	}

}
