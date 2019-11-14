import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class rte16s3 {
	
	static int n;
	static int l;
	
	static int [][] adj;
	static int [] dep;
	static int [][] sparse;
	static long [][] cost;
	
	static void dfs(int node, int parent, int dist) {
		
		if (node != 0) dep[node] = dep[parent] + 1;
		
		sparse[node][0] = parent;
		cost[node][0] = dist;
		
		for (int i=1; i<=l; i++) {
			sparse[node][i] = sparse[sparse[node][i-1]][i-1]; 
			cost[node][i] = cost[node][i-1] + cost[sparse[node][i-1]][i-1];
		}
		
		for (int i=0; i<n; i++) {
			if (adj[node][i] != 0 && i != parent) dfs(i, node, adj[node][i]);
		}
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		n = sc.nextInt();
		l = (int) Math.ceil(Math.log(n)/Math.log(2));
		
		adj = new int [n][n];
		dep = new int [n];
		sparse = new int [n][l+1];
		cost = new long [n][l+1];
		
		for (int i=0; i<n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			adj[a][b] = w;
			adj[b][a] = w;
		}
		
		dfs(0, 0, 0);
		
		int q = sc.nextInt();
		
		for (int t=0; t<q; t++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			long sum = 0;
			
			while(dep[u]>dep[v]) {
				while(l>0 && dep[u] - (1<<l) < dep[v]) l--;
				sum += cost[u][l];
				u = sparse[u][l];
			}
			while(dep[u]<dep[v]) { 
				while(l>0 && dep[v] - (1<<l) < dep[u]) l--;
				sum += cost[v][l];
				v = sparse[v][l];
			}
			
			l = (int) Math.ceil(Math.log(n)/Math.log(2));

			while(u != v) {
				while(l>0 && sparse[u][l] == sparse[v][l]) l--;
				sum += cost[u][l];
				sum += cost[v][l];
				u = sparse[u][l];
				v = sparse[v][l];
			}
			
			System.out.println(sum);
		}
	}
	
	public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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