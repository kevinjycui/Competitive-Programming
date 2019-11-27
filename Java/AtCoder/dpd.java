import java.util.Scanner;

public class dpd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		
		int [] w = new int [N];
		int [] v = new int [N];
		
		for (int i=0; i<N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		
		long [] dp = new long [W+1];
		
		for (int i=0; i<N; i++) 
			for (int j=W; j>=0; j--)
				if (j - w[i] >= 0) 
					dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
		
		System.out.println(dp[W]);
	}

}
