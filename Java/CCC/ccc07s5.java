import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp_reduction2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int l = 0; l < t; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()),
					w = Integer.parseInt(st.nextToken());
			
			int[] pins = new int[60005], psa = new int[60005];
			
			int dp[][] = new int[60005][505];
			
			for (int i = 1; i <= n; i++)
				pins[i] = Integer.parseInt(br.readLine());
			
			for (int i = 1; i <= n; i++)
				psa[i] = psa[i - 1] + pins[i];
			
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j <= k; j++) {
					// throw
					dp[i + w][j + 1] = Math.max(dp[i + w][j + 1], dp[i][j] + psa[i + w - 1] - psa[i - 1]);
					// pass
					dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
				}
			}
			int ans = 0;
			for (int a = 0; a < 60000; a++) {
				for (int b = 0; b <= k; b++) {
					ans = Math.max(ans, dp[a][b]);
				}
			}
			System.out.println(ans);
		}
	}

}