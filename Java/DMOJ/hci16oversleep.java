import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class hci16oversleep {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		char [][] graph = new char [r][c];
		int [][] distance = new int [r][c];
		
		int sx = -1;
		int sy = -1;
		int ex = -1;
		int ey = -1;
		
		for (int i=0; i<r; i++) {
			String s = sc.next();
			Arrays.fill(distance[i], Integer.MAX_VALUE);
			for (int j=0; j<c; j++) {
				if (s.charAt(j) == 's') {
					sx = i;
					sy = j;
					graph[i][j] = '.';
				}
				else if (s.charAt(j) == 'e') {
					ex = i;
					ey = j;
					graph[i][j] = '.';
				} else {
					graph[i][j] = s.charAt(j);
				}
			}
		}
		
		distance[sx][sy] = 0;
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		xq.add(sx);
		yq.add(sy);
		
		while (!xq.isEmpty()) {
			int x = xq.pop();
			int y = yq.pop();
			
			if (x+1<r && graph[x+1][y] == '.' && distance[x+1][y] > distance[x][y]+1) {
				xq.add(x+1);
				yq.add(y);
				distance[x+1][y] = distance[x][y]+1;
			}
			if (x-1>=0 && graph[x-1][y] == '.' && distance[x-1][y] > distance[x][y]+1) {
				xq.add(x-1);
				yq.add(y);
				distance[x-1][y] = distance[x][y]+1;
			}
			if (y+1<c && graph[x][y+1] == '.' && distance[x][y+1] > distance[x][y]+1) {
				xq.add(x);
				yq.add(y+1);
				distance[x][y+1] = distance[x][y]+1;
			}
			if (y-1>=0 && graph[x][y-1] == '.' && distance[x][y-1] > distance[x][y]+1) {
				xq.add(x);
				yq.add(y-1);
				distance[x][y-1] = distance[x][y]+1;
			}
		}
		
		if (distance[ex][ey] == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(distance[ex][ey]-1);
	}

}