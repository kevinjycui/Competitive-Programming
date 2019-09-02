import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class intrvl {
	static class point implements Comparable<point> {
		int pos, type, queryNumber;
		
		public int compareTo(point p) {
			if (p.pos!=pos) {
				return pos-p.pos;
			}
			return type-p.type;
		}
		point (int P, int T, int QN) {
			pos=P;
			type=T;
			queryNumber = QN;
		}
	}
	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int N = fr.nextInt();
		int Q = fr.nextInt();
		point [] intervals = new point[2*N+Q];
		for (int i=0; i<N; i++) {
			int a = fr.nextInt();
			intervals[2*i] = new point(a, 1, 2*i);
			int b = fr.nextInt();
			intervals[2*i+1] = new point(b, 3, 2*i+1);
		}
		for (int i=2*N; i<2*N+Q; i++) {
			int a = fr.nextInt();
			intervals[i] = new point(a, 2, i-2*N);
		}
		Arrays.sort(intervals);
		
		int count = 0;
		int [] ans = new int [Q+N];
		for (int i=0; i<2*N+Q; i++) {
			if (intervals[i].type == 1) {
				count++;
			}
			if (intervals[i].type == 3) {
				count--;
			}
			if (intervals[i].type == 2) {
				ans[intervals[i].queryNumber] = count;
			}
		}
		for (int i=0; i<Q; i++) {
			System.out.println(ans[i]);
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
