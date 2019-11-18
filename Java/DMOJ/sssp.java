import java.util.PriorityQueue;
import java.util.Scanner;

public class sssp {

	static class Path implements Comparable<Path>{
		int node;
		int dist;
		Path (int _n, int _d){
			node = _n;
			dist = _d;
		}
		
		public int compareTo(Path o) {
			return dist-o.dist;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] graph = new int [1001][1001];
		
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
				graph[i][j] = Integer.MAX_VALUE;
		
		for(int i = 0; i<m; i++) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			int w = sc.nextInt();
			if (w >= graph[u][v]) continue;
			graph[u][v] = w;
			graph[v][u] = w;
		}
		
		int distance[] = new int[1001];
		for (int i=0; i<n; i++)
			distance[i] = Integer.MAX_VALUE;
		
		PriorityQueue<Path> pq = new PriorityQueue<Path>();		
		
		pq.add(new Path(0, 1));
		
		while(!pq.isEmpty()) {
			Path p = pq.poll();
			int dist = p.dist;
			int node = p.node;
						
			if (distance[node] < dist) continue;
			distance[node] = dist;
			
			for (int i=0; i<n; i++) 
				if (graph[node][i] != Integer.MAX_VALUE)
					pq.add(new Path(i, graph[node][i] + dist));
		}
		
		for (int i=0; i<n; i++) {
			if (distance[i] == Integer.MAX_VALUE)
				System.out.println(-1);
			else
				System.out.println(distance[i]-1);
		}
		
	}

}
