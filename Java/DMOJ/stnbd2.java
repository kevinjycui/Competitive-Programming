import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class stnbd2 {
	
	static final int MAXN = 100001;
	static final long MOD = 1000000007;
	
	static int [] in;
	static ArrayList<Integer> adj [];
	static ArrayList<Integer> order;
	static long [] paths; 
	static long [] dp;
	static boolean [] visited;
	
	static void dfs(int p) {
		
		visited[p] = true;
		
		for (int i=0; i<adj[p].size(); i++)
			if (!visited[adj[p].get(i)])
				dfs(adj[p].get(i));
		
		order.add(p);
		
	}

	public static void main(String[] args) throws IOException {

		Reader sc = new Reader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		adj = new ArrayList [MAXN];
		for (int i=0; i<n; i++)
			adj[i] = new ArrayList<Integer>();
		
		in = new int [MAXN];
		order = new ArrayList<Integer>();
		paths = new long [MAXN];
		dp = new long [MAXN];
		visited = new boolean [MAXN];
		
		for (int l=0; l<m; l++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			in[j]++;
			adj[i].add(j);
		}
		
		for (int i=0; i<n; i++)
			if (in[i] == 0){
				paths[i] = 1;
				dfs(i);
			}
		
		Collections.reverse(order);
		
		for (int c : order)
	        for (int i : adj[c]){
	        	paths[i] = (paths[i] % MOD + paths[c] % MOD) % MOD;
	            dp[i] = (dp[i] % MOD + dp[c] % MOD + paths[c] % MOD) % MOD;
	        }
		
		long ans = 0;
		
		for (int i=0; i<n; i++)
	        if (adj[i].size() == 0)
	            ans = (ans + dp[i] % MOD) % MOD;

		System.out.println(ans % MOD);
		
	}
	
	static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 

}