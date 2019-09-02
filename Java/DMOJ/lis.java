import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class lis {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int a [] = new int [n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		ArrayList<Integer> lis = new ArrayList<Integer>();
		lis.add(-1);
		for (int i=0; i<n; i++) {
			if (a[i]<lis.get(lis.size()-1)) {
				int low = 0;
				int high = lis.size()-1;
				while (low<high) {
					int mid = (low+high)/2;
					if (lis.get(mid)<a[i]) {
						low = mid+1;
					} else {
						high = mid;
					}
				}
				lis.set(low, a[i]);
			}
			else if (a[i]>lis.get(lis.size()-1)) {
				lis.add(a[i]);
			}
		}

		System.out.println(lis.size()-1);
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