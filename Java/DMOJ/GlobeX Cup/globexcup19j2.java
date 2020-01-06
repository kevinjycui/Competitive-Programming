import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class globexcup19j2 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		int boosts = (int)Math.min(n/a, m/b);
		
		long [][] levels = new long [6][10];
		
		for (int i=0; i<6; i++)
			for (int j=0; j<10; j++)
				levels[i][j] = sc.nextLong();

		long max = 0;
		
		for (int x=0; x<=boosts; x++) {
			for (int y=0; y<=boosts-x; y++) {
				for (int z=0; z<=boosts-x-y; z++) {
					for (int u=0; u<=boosts-x-y-z; u++) {
						for (int v=0; v<=boosts-x-y-z-u; v++) {
							for (int w=0; w<=boosts-x-y-z-u-v; w++) {
								max = Math.max(max, 
										levels[0][x] +
										levels[1][y] +
										levels[2][z] +
										levels[3][u] +
										levels[4][v] +
										levels[5][w]);
							}
						}
					}
				}
			}
		}
		
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
