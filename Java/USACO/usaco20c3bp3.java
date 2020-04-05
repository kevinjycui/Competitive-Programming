import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class usaco20c3bp3 {
	
	static int n;
	static int [] seq;
	
	static void swap(int i, int j) {
		
		while (i < j) {
			int t = seq[i];
			seq[i] = seq[j];
			seq[j] = t;
			i++; j--;
		}
		
	}
	
	static boolean reverted(int [] a) {
		
		for (int i=0; i<n; i++)
			if (seq[i] != a[i])
				return false;
		return true;
		
	}

	public static void main(String[] args) throws FileNotFoundException {

//		Scanner sc = new Scanner(System.in);
		FastReader sc = new FastReader(new FileInputStream("swap.in"));
		PrintWriter pw = new PrintWriter("swap.out");
		
		n = sc.nextInt();
		int k = sc.nextInt();
		
		int a1 = sc.nextInt()-1;
		int a2 = sc.nextInt()-1;
		
		int b1 = sc.nextInt()-1;
		int b2 = sc.nextInt()-1;
		
		seq = new int [101];
		int [] org = new int [101];
		
		for (int i=0; i<n; i++) {
			seq[i] = i+1;
			org[i] = i+1;
		}		
		
		ArrayList<int []> vers = new ArrayList<int []>();
		
		vers.add(org);
		
		swap(a1, a2);
		swap(b1, b2);
		
		while (!reverted(org)) {
			
			int [] t = new int [101];
			for (int i=0; i<n; i++)
				t[i] = seq[i];
			vers.add(t);
			
			swap(a1, a2);
			swap(b1, b2);
			
		}
		
		int [] ans = vers.get(k%vers.size());
		
		for (int i=0; i<n; i++)
//			System.out.println(ans[i]);	
			pw.println(ans[i]);
		
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
