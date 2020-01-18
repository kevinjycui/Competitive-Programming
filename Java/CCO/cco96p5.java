import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class cco96p5 {
	
	static String [] steps;
	static Hashtable<String, Integer> cities;
	static ArrayList<String> adj [];
	
	static void dfs(int v) {
		
		for (int i=0; i<adj[v].size(); i++) {
			steps[cities.get(adj[v].get(i))] = steps[v] + adj[v].get(i).substring(0, 1);
			dfs(cities.get(adj[v].get(i)));
		}
		
	}

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		cities = new Hashtable<String, Integer>();
		cities.put("Rome", 0);
		
		int v = 1;
		
		adj = new ArrayList[2*n+1];
		for (int i=0; i<2*n+1; i++)
			adj[i] = new ArrayList<String>();
		
		for (int i=0; i<n; i++) {
			String a = sc.next();
			String b = sc.next();
			if (!cities.containsKey(a)) {
				cities.put(a, v);
				v++;
			}
			if (!cities.containsKey(b)) {
				cities.put(b, v);
				v++;
			}
			adj[cities.get(a)].add(b);
		}
		
		steps = new String[v];
		steps[0] = "R";
		
		dfs(0);
		
//		for (int i=0; i<v; i++)
//			System.out.println(steps[i]);
		
		for (int i=0; i<m; i++) {
			String a = sc.next();
			String b = sc.next();
			
			String p1 = steps[cities.get(a)];
			String p2 = steps[cities.get(b)];
						
			int ancestor = 0;
			for (int j=0; j<Math.min(p1.length(), p2.length()); j++)
				if (p1.charAt(j) == p2.charAt(j))
					ancestor = j;
			
			for (int j=p1.length()-1; j>=ancestor+1; j--)
				System.out.print(p1.charAt(j));
			System.out.print(p1.charAt(ancestor));
			for (int j=ancestor+1; j<p2.length(); j++)
				System.out.print(p2.charAt(j));
			System.out.println();
			
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
