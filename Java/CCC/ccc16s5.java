import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc16s5 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();

		int n = sc.nextInt();
		long t = sc.nextLong();

		String s = sc.next();
		int [] c = new int[100001];
		int [] m = new int[100001];
		
		for (int i=0; i<n; i++)
			m[i] = Integer.parseInt(Character.toString(s.charAt(i)));

		for(long k=49; k>=0; k--)
	        if(((t >> k) & 1) > 0) {
	        	for (int i=0; i<n; i++) {
	        		int a = (int)((1L << k)%n);
	        		int b = (n-a)%n;
	    			c[i] = m[(i+a)%n] ^ m[(i+b)%n];
	        	}
	        	for (int i=0; i<n; i++)
	        		m[i] = c[i];
	        }
		
		for(int i=0; i<n; i++)
			System.out.print(m[i]);
		System.out.println();
		
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