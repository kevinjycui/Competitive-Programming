import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc96s5 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		int t = sc.nextInt();
		
		int [] x = new int [100002];
		int [] y = new int [100002];
		
		for (int l=0; l<t; l++) {
			
			int n = sc.nextInt();
			
			for (int i=0; i<n; i++)
				x[i] = sc.nextInt();
			for (int j=0; j<n; j++)
				y[j] = sc.nextInt();
			
			int dp = 0;
			
			for (int i=0; i<n; i++)
				for (int j=0; j<n; j++)
					if (j >= i && y[j] >= x[i])
						dp = Math.max(dp, j-i);
			
			System.out.println("The maximum distance is "+dp);
			
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