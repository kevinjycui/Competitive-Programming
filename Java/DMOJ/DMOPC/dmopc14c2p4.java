import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc14c2p4 {

	public static void main(String[] args) {

		FastReader in = new FastReader();
		
		int n = in.nextInt();
		int [] trees = new int [n+1];
		trees[0] = 0;
		for (int i=1; i<=n; i++) {
			trees[i] = in.nextInt() + trees[i-1];
		}
		int q = in.nextInt();
		for (int i=1; i<=q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(trees[b+1] - trees[a]);
		}
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