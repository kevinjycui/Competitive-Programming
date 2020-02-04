import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class ncco4d1p3 {

	static ArrayList<Node> adj [] = new ArrayList[5001];

	static class Node implements Comparable<Node>{
		int node;
		int weight;

		public Node(int n, int w) {
			node = n;
			weight = w;
		}

		public int compareTo(Node o) {
			return weight-o.weight;
		}
	}

	public static void main(String[] args) throws IOException {

		Reader sc = new Reader();

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i=1; i<=n; i++)
			adj[i] = new ArrayList<Node>();

		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int w = sc.nextInt();
			adj[a].add(new Node(b, w));
			adj[b].add(new Node(a, w));
		}

		int [] dist1 = new int [5001];
		for (int i=2; i<=n; i++)
			dist1[i] = Integer.MAX_VALUE;
		dijkstra(1, dist1);

		int [] dist2 = new int [5001];
		for (int i=1; i<n; i++)
			dist2[i] = Integer.MAX_VALUE;
		dijkstra(n, dist2);

		int sec = Integer.MAX_VALUE;

		for (int i=1; i<=n; i++) {
			for (int j=0; j<adj[i].size(); j++) {
				Node e = adj[i].get(j);
				int v = dist1[i] + dist2[e.node] + e.weight;
				if (v > dist1[n] && sec > v)
					sec = v;
			}
		}

		System.out.println(sec);

	}

	static void dijkstra(int v, int [] dist) {

		PriorityQueue<Node> pq = new PriorityQueue<Node>();

		pq.add(new Node(v, 0));

		while (!pq.isEmpty()) {

			Node p = pq.poll();
			int node = p.node;

			for (int i=0; i<adj[node].size(); i++) {
				Node c = adj[node].get(i);
				if (dist[c.node] > dist[node] + c.weight) {
					dist[c.node] = dist[node] + c.weight;
					pq.add(new Node(c.node, dist[c.node]));
				}
			}
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