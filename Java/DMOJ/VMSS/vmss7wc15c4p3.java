import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class vmss7wc15c4p3 {
	
	private static int n;
	private static ArrayList<Integer> adj [];
	private static ArrayList<Integer> dis [];
	
	static class Path implements Comparable<Path>{
		int node;
		int d;
		Path(int _n, int _d) {
			node = _n;
			d = _d;
		}
		
		public int compareTo(Path o) {
			return d-o.d;
		}
	}
	
	static int [] dijkstra(int i) {
		int [] distance = new int [n];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[i] = 0;

		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		pq.add(new Path(i, 0));

		while (!pq.isEmpty()) {
			Path p = pq.poll();
			int N = p.node;
			int D = p.d;

			if (distance[N] < D) continue;
			distance[N] = D;

			for (int j=0; j<adj[N].size(); j++) {
				pq.add(new Path(adj[N].get(j), D+dis[N].get(j)));
			}
		}
		
		return distance;
	}

	public static void main(String[] args) {

		FastReader in = new FastReader(System.in);
		
		n = in.nextInt();
		int m = in.nextInt();
		
		adj = new ArrayList[n];
		dis = new ArrayList[n];
		
		for (int i=0; i<n; i++) {
			adj[i] = new ArrayList<Integer>();
			dis[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			adj[a].add(b);
			adj[b].add(a);
			int t = in.nextInt();
			dis[a].add(t);
			dis[b].add(t);
		}
		
		int [] d1 = dijkstra(0);
		int [] d2 = dijkstra(n-1);
		
		int max = 0;
		
		for (int i=0; i<n; i++) {
			max = Math.max(max, d1[i] + d2[i]);
		}
		
		System.out.println(max);
		
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