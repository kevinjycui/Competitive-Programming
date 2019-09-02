import java.io.*;
import java.util.*;


public class coci067p3 {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int h = sc.nextInt();

		int [] line = new int [500001];

		int count = 0;

		for (int i=0; i<n; i+=2) {
			line[h-sc.nextInt()]++;
			line[sc.nextInt()]--;
			count++;
		}

		int num = 0;
		int min = 200001;
		for (int j=0; j<h; j++) {
			count+=line[j];
			if (count<min) {
				min=count;
				num=0;
			} 
			if (count==min) {
				num++;
			}
		}
		System.out.println(min+" "+num);
		System.exit(0);
	}

	static class FastReader {
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
				catch (IOException  e) {
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
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}