import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class usaco20c3bp2 {

	public static void main(String[] args) throws FileNotFoundException {

//		Scanner sc = new Scanner(System.in);
		FastReader sc = new FastReader(new FileInputStream("breedflip.in"));
		PrintWriter pw = new PrintWriter("breedflip.out");
		
		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		
		boolean prev = true;
		int count = 0;
		
		for (int i=0; i<n; i++) {
			if (a.charAt(i) == b.charAt(i))
				prev = true;
			else {
				if (prev)
					count++;
				prev = false;
			}
		}
		
		pw.println(count);
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
