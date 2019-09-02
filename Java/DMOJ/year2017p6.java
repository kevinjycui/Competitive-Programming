import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class year2017p6 {
	
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int draw[] = new int[n+1];
        int cost[] = new int[n+1];
        for(int i = 1; i <= n; i++) {
            cost[i] = in.nextInt();
            draw[i] = in.nextInt();
        } 
        long dp[][] = new long[n+2][n+2];
        for(int i = 0; i <=n; i++) {
            for(int j = 0; j <= n; j++) {
                dp[i][j] = Long.MAX_VALUE;
            }
        }
        dp[1][1] = 0;
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <= n; j++) {
                if(dp[i][j] != Long.MAX_VALUE) {
                    dp[i+1][Math.min(j+draw[i], n)] = 
                    Math.min(dp[i+1][Math.min(j + draw[i], n)], dp[i][j] + cost[i]);
                    if(i!=j) {
                        dp[i+1][j] = Math.min(dp[i][j],  dp[i+1][j]);
                    }
                }
            }
        }
        System.out.println(dp[n][n]);
    }
    
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}