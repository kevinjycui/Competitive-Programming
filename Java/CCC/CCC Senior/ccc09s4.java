import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.PriorityQueue;

public class ccc09s4 {
	
	static class Path implements Comparable<Path>{
		int y;
		int cost;
		
		public Path(int _y, int _c) {
			y = _y;
			cost = _c;
		}
		
		public int compareTo(Path o) {
			return cost-o.cost;
		}
	}

	public static void main(String[] args) throws IOException {

		Reader sc = new Reader();
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int [][] adj = new int[5001][5001];
		int [] costs = new int[5001];
		long [] pens = new long [5001];
		
		for (int i=1; i<=n; i++) {
			costs[i] = Integer.MAX_VALUE;
			pens[i] = -1;
			for (int j=1; j<=n; j++)
				adj[i][j] = Integer.MAX_VALUE;
		}
		
		for (int i=0; i<t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			adj[x][y] = Math.min(adj[x][y], c);
			adj[y][x] = Math.min(adj[y][x], c);
		}
		
		int k = sc.nextInt();
		
		for (int i=0; i<k; i++) {
			int z = sc.nextInt();
			pens[z] = sc.nextLong();
		}
		
		PriorityQueue<Path> pq = new PriorityQueue<Path>();
		
		int d = sc.nextInt();
		
		pq.add(new Path(d, 0));
		costs[d] = 0;
		
		while (!pq.isEmpty()) {
			
			Path p = pq.poll();
			int node = p.y;
			
			for (int i=1; i<=n; i++)
				if (adj[node][i] != Integer.MAX_VALUE && costs[i] > costs[node] + adj[node][i]) {
					costs[i] = costs[node] + adj[node][i];
					pq.add(new Path(i, costs[i]));
				}
			
		}
		
		long min = Long.MAX_VALUE;
		
		for (int i=1; i<=n; i++)
			if (pens[i] != -1)
				min = Math.min(min, pens[i] + costs[i]);
		
		System.out.println(min);
			
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