import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class nccc5j5s3 {
	
	static int n;
	static ArrayList<Integer> adj [];
	static boolean [] visited;
	
	static void dfs(int node, int s, int e) {
		
		visited[node] = true;
		
		if (node == n-1)
			return;
		
		for (int i=0; i<adj[node].size(); i++)
			if (!visited[adj[node].get(i)] && (node != s || adj[node].get(i) != e))
				dfs(adj[node].get(i), s, e);
		
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		n = sc.nextInt();
		int m = sc.nextInt();
		
		adj = new ArrayList [n];
		visited = new boolean [n];
		
		for (int i=0; i<n; i++)
			adj[i] = new ArrayList<Integer>();
		
		int [] start = new int [m];
		int [] end = new int [m];
		
		for (int i=0; i<m; i++) {
			start[i] = sc.nextInt()-1;
			end[i] = sc.nextInt()-1;
			adj[start[i]].add(end[i]);
		}
		
		for (int i=0; i<m; i++) {
			Arrays.fill(visited, false);
			dfs(0, start[i], end[i]);
			
			if (visited[n-1])
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
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