import java.util.Scanner;

public class ecoo1p4 {
	
	static int w;
	static int h;
	
	static void dfs(int x, int y, char [][] graph, boolean [][] visited) {
		visited[x][y] = true;
		if (x-1>=0 && graph[x-1][y] == 'X' && !visited[x-1][y]) {
			dfs(x-1, y, graph, visited);
		}
		if (y-1>=0 && graph[x][y-1] == 'X' && !visited[x][y-1]) {
			dfs(x, y-1, graph, visited);
		}
		if (x+1<h && graph[x+1][y] == 'X' && !visited[x+1][y]) {
			dfs(x+1, y, graph, visited);
		}
		if (y+1<w && graph[x][y+1] == 'X' && !visited[x][y+1]) {
			dfs(x, y+1, graph, visited);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int t=1; t<=5; t++) {
			
			w = sc.nextInt();
			h = sc.nextInt();
			
			char [][] graph = new char [h][w];
			boolean [][] visited = new boolean [h][w];
			
			int count = 0;
			
			for (int i=0; i<h; i++) {
				String s = sc.next();
				for (int j=0; j<w; j++) {
					graph[i][j] = s.charAt(j);
				}
			}
			
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					if (!visited[i][j] && graph[i][j] == 'X') {
						dfs(i, j, graph, visited);
						count++;
					}
				}
			}
			
			System.out.println("In rectangle #"+t+" are "+count+" shapes");
			
		}

	}

}
