import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc07s3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> [] adj = new ArrayList [10000];
		
		for (int i=1; i<=9999; i++) 
			adj[i] = new ArrayList<Integer>();
						
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			adj[x].add(y);
		}
		
		int [] dist = new int [10000];

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0) break;
						
			Arrays.fill(dist, -1);
			dist[a] = 0;
			
			LinkedList<Integer> q = new LinkedList<Integer>();
			
			q.add(a);
			boolean loop = false;
			
			while (!q.isEmpty()) {
				
				int f = q.pop();
				
				for (int i=0; i<adj[f].size(); i++) {
					if (dist[adj[f].get(i)] == -1) {
						dist[adj[f].get(i)] = dist[f] + 1;
						q.add(adj[f].get(i));
					} else if (adj[f].get(i) == a)
						loop = true;
				}
				
			}
						
			System.out.println(loop && dist[b] != -1 ? "Yes " + (dist[b] - 1) : "No");
			
		}
		
		
	}

}
