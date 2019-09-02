import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class wc96p5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] graph = new int[m+1][n+1];
		for (int i=1; i<=m; i++) {
			for (int j=1; j<=n; j++) {
				graph[i][j] = 0;
			}
		}
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0 && b==0) break;
			graph[a][b] = 1;
		}
		
		int [][] apples = new int [m+1][n+1];
		for (int i=1; i<=m; i++) {
			for (int j=1; j<=n; j++) {
				apples[i][j] = 0;
			}
		}
		apples[1][1] = graph[1][1];
		
		LinkedList<Integer> queue_X = new LinkedList<Integer>();
		LinkedList<Integer> queue_Y = new LinkedList<Integer>();
		
		queue_X.add(1);
		queue_Y.add(1);
		
		while (!queue_X.isEmpty()) {
			int x = queue_X.pop();
			int y = queue_Y.pop();
			if (x+1<=m && apples[x][y]+graph[x+1][y]>apples[x+1][y]) {
				apples[x+1][y] = apples[x][y]+graph[x+1][y];
				queue_X.add(x+1);
				queue_Y.add(y);
			}
			if (y+1<=n && apples[x][y]+graph[x][y+1]>apples[x][y+1]) {
				apples[x][y+1] = apples[x][y]+graph[x][y+1];
				queue_X.add(x);
				queue_Y.add(y+1);
			}
		}
		
		System.out.println(apples[m][n]);
	}

}
