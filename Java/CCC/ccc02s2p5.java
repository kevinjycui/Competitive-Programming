import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ccc02s2p5 {

	static double getDistance(int x, int y, int x2, int y2) {
		return Math.sqrt(Math.pow(y2-y, 2)+Math.pow(x2-x, 2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int [] x = new int [755];
		int [] y = new int [755];
		ArrayList<Integer> edges[] = new ArrayList[755];
		for (int i=0; i<N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			edges[i] = new ArrayList<Integer>();
		}

		int M = sc.nextInt();
		for (int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--; b--;
			edges[a].add(b);
			edges[b].add(a);
		}
		PriorityQueue<path> pq = new PriorityQueue<path>();
		pq.add(new path(0.0,0,0));
		boolean [] visited = new boolean[1000];
		ArrayList<path> output = new ArrayList<path>();
		double ans = 0;

		while (!pq.isEmpty()) {
			path current = pq.poll();
			int n = current.node;
			int p = current.parent;
			double d = current.dist;
			if (visited[current.node]) continue;
			ans+=d;
			output.add(current);
			visited[n] = true;
			for (int i=0; i<N; i++) {
				if (!visited[i]) {
					pq.add(new path(getDistance(x[n],y[n],x[i],y[i]),n,i));
				}
			}
			for (int i=0; i<edges[n].size(); i++) {
				int next = edges[n].get(i);
				if (!visited[next]) {
					pq.add(new path(0,n,next));
				}
			}
		}
		System.out.println(String.format("%.2f", ans));
		for (int i=1; i<N; i++) {
			if (output.get(i).dist != 0) {
				System.out.println((output.get(i).node + 1) +" "+ (output.get(i).parent + 1));
			}
		}
	}
	static class path implements Comparable<path>{
		int node;
		int parent;
		double dist;
		path (double _dist, int _parent, int _node) {
			node = _node;
			dist = _dist;
			parent = _parent;
		}
		public int compareTo(path o) {
			double diff = dist - o.dist;
			if (diff < 0) return -1;
			if (diff > 0) return 1;
			return 0;
		}
	}
}
