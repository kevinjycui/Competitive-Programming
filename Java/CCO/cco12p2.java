import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class cco12p2 {

	static int n;

	static class Edge implements Comparable<Edge> {

		int node;
		int length;

		public Edge(int n, int l) {
			node = n;
			length = l;
		}

		public int compareTo(Edge o) {
			return length-o.length;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Edge> adj1 [] = new ArrayList[20001];
		ArrayList<Edge> adj2 [] = new ArrayList[20001];

		for (int i=1; i<=n; i++) {
			adj1[i] = new ArrayList<Edge>();
			adj2[i] = new ArrayList<Edge>();
		}

		for (int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int l = sc.nextInt();
			adj1[a].add(new Edge(b, l));
			adj2[b].add(new Edge(a, l));
		}

		int [] dist1 = new int [20001];
		dijkstra(1, dist1, adj1);

		int [] dist2 = new int [20001];
		dijkstra(n, dist2, adj2);
		
//		for (int i=1; i<=n; i++)
//			System.out.print(dist1[i]+" ");
//		System.out.println();
//		for (int i=1; i<=n; i++)
//			System.out.print(dist2[i]+" ");
//		System.out.println();

		int second = 1 << 30;

		for (int i=1; i<=n; i++)
			for (int j=0; j<adj1[i].size(); j++) {
				int v = dist1[i] + dist2[adj1[i].get(j).node] + adj1[i].get(j).length;
				if (v > dist1[n] && second > v)
					second = v;
			}
		
		System.out.println(second == 1 << 30 ? -1:second);

	}

	public static void dijkstra(int v, int [] dist, ArrayList<Edge> adj []) {

		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

		for (int i=1; i<=n; i++)
			dist[i] = 1 << 30;
		dist[v] = 0;
		pq.add(new Edge(v, 0));

		while (!pq.isEmpty()) {

			Edge e = pq.poll();

			for (int i=0; i<adj[e.node].size(); i++) {

				Edge c = adj[e.node].get(i);

				if (dist[c.node] > dist[e.node] + c.length) {
					dist[c.node] = dist[e.node] + c.length;
					pq.add(new Edge(c.node, dist[c.node]));
				}

			}

		}


	}

}