import java.util.ArrayList;
import java.util.Scanner;

public class vmss7wc16c3p2 {

	static int n;
	static ArrayList<Integer> adj [] = new ArrayList[2001];
	static boolean [] visited = new boolean[2001];

	static void dfs(int r) {
		visited[r] = true;
		for (int i=0; i<adj[r].size(); i++) {
			if (!visited[adj[r].get(i)]) dfs(adj[r].get(i));
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt()-1;
		int b = sc.nextInt()-1;
		
		for (int i=0; i<n; i++) adj[i] = new ArrayList<Integer>();

		for (int i=0; i<m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			adj[x].add(y);
			adj[y].add(x);
		}
		
		dfs(a);
		
		if (visited[b]) System.out.println("GO SHAHIR!");
		else System.out.println("NO SHAHIR!");
		
	}

}