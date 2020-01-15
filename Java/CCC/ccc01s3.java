import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc01s3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> adj [] = new ArrayList[26];
		
		for (int i=0; i<26; i++) 
			adj[i] = new ArrayList<Integer>();
		
		String s = sc.next();
		
		LinkedList<Integer> xs = new LinkedList<Integer>();
		LinkedList<Integer> ys = new LinkedList<Integer>();

		
		while (!s.equals("**")) {
			
			int a = s.charAt(0) - 'A';
			int b = s.charAt(1) - 'A';
			
			adj[a].add(b);
			adj[b].add(a);
			
			xs.add(a);
			ys.add(b);
			
			s = sc.next();
			
		}
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		boolean [] visited = new boolean[26];
		
		int sum = 0;
		
		while (!xs.isEmpty()) {
			
			int x = xs.pop();
			int y = ys.pop();
			
			Arrays.fill(visited, false);
			
			q.add(0);
			
			while (!q.isEmpty()) {
				
				int c = q.pop();
				visited[c] = true;
				
				for (int i=0; i<adj[c].size(); i++)
					if (!visited[adj[c].get(i)] && ((c != x || adj[c].get(i) != y) && (c != y || adj[c].get(i) != x)))
						q.add(adj[c].get(i));
				
			}
			
			if (!visited[1]) {
				System.out.println((char)(x+'A')+""+(char)(y+'A'));
				sum++;
			}
			
		}
		
		System.out.println("There are "+sum+" disconnecting roads.");
		
		
	}

}