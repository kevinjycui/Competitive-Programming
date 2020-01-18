import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bts16p5 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int [] value = new int [10001];
		
		for (int i=1; i<=n; i++)
			value[i] = sc.nextInt();
		
		int [] adj = new int [10001];
		int [] weight = new int [10001];
				
		for (int i=2; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			adj[b] = a;
			weight[b] = w;
		}
				
		for (int b=n; b>1; b--) {
			weight[adj[b]] += weight[b];
			value[adj[b]] += value[b];			
		}
		
//		for (int i=1; i<=n; i++)
//			System.out.println(i+" W:"+weight[i]+" V:"+value[i]);

		int count = 0;
		
		for (int i=2; i<=n; i++)
			if (value[i] >= c && weight[i] <= k)
				count++;
		
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