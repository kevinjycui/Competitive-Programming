import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class coci08c2p5 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();
		
		String s = sc.next();
		
		BigInteger v = new BigInteger("1");
		BigInteger n = new BigInteger("1");
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'P')
				continue;
			else if (s.charAt(i) == 'L')
				v = v.multiply(new BigInteger("2"));
			else if (s.charAt(i) == 'R')
				v = v.multiply(new BigInteger("2")).add(n);
			else {
				v = v.multiply(new BigInteger("5")).add(n);
				n = n.multiply(new BigInteger("3"));
			}
				
		}
		
		System.out.println(v.toString());
		
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