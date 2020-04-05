import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class usaco20c3bp1 {

	public static void main(String[] args) throws FileNotFoundException {

//		Scanner sc = new Scanner(System.in);
		FastReader sc = new FastReader(new FileInputStream("triangles.in"));
		PrintWriter pw = new PrintWriter("triangles.out");
		
		int n = sc.nextInt();
		int [] x = new int [101];
		int [] y = new int [101];
		
		int [] height = new int [101];
		int [] base = new int [101];
		
		for (int i=0; i<n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
				if (i != j) {
					if (x[i] == x[j])
						height[i] = Math.max(height[i], Math.abs(y[i] - y[j]));
					if (y[i] == y[j])
						base[i] = Math.max(base[i], Math.abs(x[i] - x[j]));
				}
		
		int max = 0;
		for (int i=0; i<n; i++)
			max = Math.max(max, base[i]*height[i]);
		
//		System.out.println(max);
		pw.println(max);
		pw.close();
		
	}
	
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream I) {
            br = new BufferedReader(new InputStreamReader(I));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

