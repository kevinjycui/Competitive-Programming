import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class dpg {
	
	private static int n;
	private static ArrayList<Integer> graph[];
	private static int [] dist;
	private static boolean [] visited;
	
	static void dfs(int x) {
		visited[x] = true;
		for (int i=0; i<graph[x].size(); i++) {
			if (!visited[graph[x].get(i)]) 
				dfs(graph[x].get(i));
			dist[x] = Math.max(dist[x], dist[graph[x].get(i)] + 1);
		}
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		n = sc.nextInt();
		int m = sc.nextInt();
		
		graph = new ArrayList [n];
		for (int i=0; i<n; i++)
			graph[i] = new ArrayList<Integer>();
		
		for (int i=0; i<m; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			graph[a].add(b);
		}
		
		dist = new int [n];
		visited = new boolean [n];
		
		for (int i=0; i<n; i++)
			if (!visited[i])
				dfs(i);
		
		int max = 0;
		for (int i=0; i<n; i++)
			max = Math.max(max, dist[i]);
		
		System.out.println(max);
		
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
