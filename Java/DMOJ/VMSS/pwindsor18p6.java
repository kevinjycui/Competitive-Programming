import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class pwindsor18p6 {
	
	private static int N;
	private static ArrayList<Integer> edges[];
	
	pwindsor18p6 (int _n) {
		N = _n;
		edges = new ArrayList[N];
		for (int i=0; i<N; i++) {
			edges[i] = new ArrayList<Integer>();
		}
	}
	
	static void dfs(int v, int steps[]) {
		for (int i=0; i<edges[v].size(); i++) {
			int k = edges[v].get(i);
			if (steps[k] > steps[v] + 1) {
				steps[k] = steps[v] + 1;
				dfs(k, steps);
			}
		}
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		
		pwindsor18p6 graph = new pwindsor18p6(n);
		
		for (int i=0; i<m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			edges[x].add(y);
			edges[y].add(x);
		}
		
		int [] steps = new int[n];
		Arrays.fill(steps, Integer.MAX_VALUE);
		steps[a] = 0;
		graph.dfs(a, steps);
				
		if (steps[0] == Integer.MAX_VALUE || steps[b] == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(steps[0]+steps[b]);
		
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