import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class vmss7wc16c3p3 {

	static int n;
	static ArrayList<Path>[] adj = new ArrayList[2001];
	static int [] distance = new int[2001];

	static void dijkstra(int r) {
		
		for (int i=0; i<adj[r].size(); i++) {
			Path p = adj[r].get(i);
			if (distance[r] + p.weight < distance[p.node]) {
				distance[p.node] = distance[r] + p.weight;
				dijkstra(p.node);
			}
		}
	}
	
	static class Path {
		int node;
		int weight;
		public Path(int _n, int _w) {
			node = _n;
			weight = _w;
		}
	}

	public static void main(String[] args) throws IOException {

		Reader sc = new Reader();

		n = sc.nextInt();
		int m = sc.nextInt();
		int b = sc.nextInt()-1;
		int q = sc.nextInt();
		
		for (int i=0; i<n; i++)
			adj[i] = new ArrayList<Path>();
				
		for (int i=0; i<m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			int z = sc.nextInt();
			adj[x].add(new Path(y, z));
			adj[y].add(new Path(x, z));
		}
		
		Arrays.fill(distance, 1 << 30);
		distance[b] = 0;
		
		dijkstra(b);
		
		for (int i=0; i<q; i++) {
			int a = sc.nextInt()-1;
			System.out.println(distance[a] == 1 << 30 ? -1 : distance[a]);
		}
		
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
