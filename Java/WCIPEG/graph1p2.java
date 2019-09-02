import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class graph1p2 { //epic ben shapiro time

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] graph = new int [n][n];
		int dis[] = new int [n];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for (int r=0; r<n; r++) {
			for (int c=0; c<n; c++) {
				graph[r][c] = sc.nextInt();
			}
		}
		LinkedList<path> l = new LinkedList<path>();	

		l.add(new path(0, 0));
		while (!l.isEmpty()) {
			path P = l.pop();
			int N = P.node;
			int D = P.distance;
			if (D<dis[N]) {
				dis[N] = D;
				for (int i=0; i<n; i++) {
					if (graph[N][i] == 1) {
						l.add(new path(D+1,i));
					}
				}
				if (N == n-1) {
					System.out.println(D);
					return;
				}
			}

		}

	}
	static class path{
		int distance, node;
		path(int D, int N) {
			node = N;
			distance = D;
		}
	}

}
