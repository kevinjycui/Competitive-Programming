package dmopc2019october;

import java.util.LinkedList;
import java.util.Scanner;

public class dmopc19c2p2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][] graph = new int [n][m];
		int [][] step = new int [n][m];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				graph[i][j] = sc.nextInt();
				step[i][j] = Integer.MAX_VALUE;
			}
		}
		step[0][0] = graph[0][0];
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		xq.add(0);
		yq.add(0);
		
		while (!xq.isEmpty()) {
			int x = xq.pop();
			int y = yq.pop();
			
			if (x+1<n && step[x+1][y] > step[x][y] + graph[x+1][y]) {
				xq.add(x+1);
				yq.add(y);
				step[x+1][y] = step[x][y] + graph[x+1][y];
			}
			if (y+1<m && step[x][y+1] > step[x][y] + graph[x][y+1]) {
				xq.add(x);
				yq.add(y+1);
				step[x][y+1] = step[x][y] + graph[x][y+1];
			}
		}
		
		System.out.println(step[n-1][m-1]);
	}

}
