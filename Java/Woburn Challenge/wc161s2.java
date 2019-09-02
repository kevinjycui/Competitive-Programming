import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class wc161s2 {
	static int n, k, answer;
	static ArrayList<Integer> [] edges = new ArrayList[200005], weights = new ArrayList[200005];
	static boolean [] treasure = new boolean [200005], important = new boolean [200005];
	public static void main(String[] args) {
		FastReader in = new FastReader();
		n=in.nextInt();
		k=in.nextInt();

		for (int i=0; i<=n; i++) {
			edges[i] = new ArrayList<Integer>();
			weights[i] = new ArrayList<Integer>();
		}
		for (int i=0; i<n-1; i++) {
			int start = in.nextInt(), end = in.nextInt(), dist = in.nextInt();
			edges[start].add(end);
			weights[start].add(dist);
			edges[end].add(start);
			weights[end].add(dist);
		}
		for (int i=0; i<k; i++) {
			int room = in.nextInt();
			treasure[room]=true;
		}
		dfs(1, -1);
		System.out.println(answer);
	
	}

	static void dfs(int node, int parent) {
		if (treasure[node]) important[node] = true;
		
		for (int i=0; i<edges[node].size(); i++) {
			int child = edges[node].get(i);
			if (parent == child) continue;
			dfs(child,node);
			if (important[child]) {
				important[node] = true;
				answer+=weights[node].get(i);
			}
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