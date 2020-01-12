import java.util.ArrayList;
import java.util.Scanner;

public class ccc07s4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> adj[] = new ArrayList[10000];
		for (int i=1; i<=n; i++)
			adj[i] = new ArrayList<Integer>();
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a == 0 && b == 0)
				break;
			
			adj[a].add(b);
			
		}
		
		int [] paths = new int[10000];
		paths[n] = 1;
		
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<adj[i].size(); j++)
				paths[i] += paths[adj[i].get(j)];
		}
		
//		for (int i=1; i<=n; i++)
//			System.out.print(paths[i]+" ");
//		System.out.println();
		
		System.out.println(paths[1]);
		
	}

}