import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class cco08p4 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		char [][] graph = new char [1001][1001];
		
		for (int i=0; i<n; i++) {
			String s = sc.next();
			for (int j=0; j<m; j++)
				graph[i][j] = s.charAt(j);
		}
		
//		for (int i=0; i<n; i++) {
//			for (int j=0; j<m; j++)
//				System.out.print(graph[i][j]);
//			System.out.println();
//		}

		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		boolean [][] visited = new boolean [1001][1001];
		
		int count = 0;
		
		for (int i=0; i<n; i++)
			for (int j=0; j<m; j++) {
				
				if (!visited[i][j]) {
					
					count++;
					
					visited[i][j] = true;
					xq.add(i);
					yq.add(j);
					
					while (!xq.isEmpty()) {
						
						int x = xq.pop();
						int y = yq.pop();
						
						if (graph[x][y] == 'W' && y-1 >= 0 && !visited[x][y-1]) {
							visited[x][y-1] = true;
							xq.add(x);
							yq.add(y-1);
						}
						
						else if (graph[x][y] == 'E' && y+1 < m && !visited[x][y+1]) {
							visited[x][y+1] = true;
							xq.add(x);
							yq.add(y+1);
						}
						
						else if (graph[x][y] == 'S' && x+1 < n && !visited[x+1][y]) {
							visited[x+1][y] = true;
							xq.add(x+1);
							yq.add(y);
						}
						
						else if (graph[x][y] == 'N' && x-1 >= 0 && !visited[x-1][y]) {
							visited[x-1][y] = true;
							xq.add(x-1);
							yq.add(y);
						}
						
						if (y+1 < m && graph[x][y+1] == 'W' && !visited[x][y+1]) {
							visited[x][y+1] = true;
							xq.add(x);
							yq.add(y+1);
						}
						
						if (y-1 >= 0 && graph[x][y-1] == 'E' && !visited[x][y-1]) {
							visited[x][y-1] = true;
							xq.add(x);
							yq.add(y-1);
						}
						
						if (x+1 < n && graph[x+1][y] == 'N' && !visited[x+1][y]) {
							visited[x+1][y] = true;
							xq.add(x+1);
							yq.add(y);
						}
						
						if (x-1 >= 0 && graph[x-1][y] == 'S' && !visited[x-1][y]) {
							visited[x-1][y] = true;
							xq.add(x-1);
							yq.add(y);
						}
						
					}
					
//					for (int a=0; a<n; a++) {
//						for (int b=0; b<m; b++)
//							System.out.print(visited[a][b] ? "1":"0");
//						System.out.println();
//					}
//					System.out.println();
					
				}
				
			}
		
		System.out.println(count);
		
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