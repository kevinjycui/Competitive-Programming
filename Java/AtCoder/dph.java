import java.util.Scanner;

public class dph {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int [][] graph = new int [h][w];
		long [][] paths = new long [h][w];
		
		for (int i=0; i<h; i++) {
			String s = sc.next();
			for (int j=0; j<w; j++) 
				graph[i][j] = s.charAt(j);
		}
		
		paths[0][0] = 1;
		
		for (int i=1; i<h; i++)
			if (graph[i][0] != '#')
				paths[i][0] = (paths[i][0] + paths[i-1][0]) % 1000000007;
		
		for (int j=1; j<w; j++)
			if (graph[0][j] != '#')
				paths[0][j] = (paths[0][j] + paths[0][j-1]) % 1000000007;

		for (int i=1; i<h; i++) {
			for (int j=1; j<w; j++) {
				if (graph[i][j] != '#')
					paths[i][j] = (paths[i][j] + paths[i-1][j] + paths[i][j-1]) % 1000000007;
			}
		}
		
		System.out.println(paths[h-1][w-1]);
		
	}

}
