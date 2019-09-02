import java.util.Scanner;

public class ccc00s4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		int [] clubs = new int [n];
		for (int i=0; i<n; i++) {
			clubs[i] = sc.nextInt();
		}
		int [] dp = new int [d+1];
		for (int i=1; i<=d; i++) {
			dp[i] = 5281;
		}
		dp[0] = 0;
		for (int i=1; i<=d; i++) {
			for (int j=0; j<n; j++) {
				if (i-clubs[j]>=0) {
					dp[i] = Math.min(dp[i], dp[i-clubs[j]]+ 1);
				}
			}
		}
		if (dp[d] == 5281) {
			System.out.println("Roberta acknowledges defeat.");
		} else {
			System.out.println("Roberta wins in "+dp[d]+" strokes.");
		}
	}

}