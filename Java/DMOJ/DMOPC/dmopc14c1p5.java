import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class dmopc14c1p5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int bx = sc.nextInt();
		int by = sc.nextInt();
		int ex = sc.nextInt();
		int ey = sc.nextInt();
		
		char [][] graph = new char[r][c];
		long [][] step = new long [r][c];
		
		for (int i=0; i<r; i++) {
			String s = sc.next();
			Arrays.fill(step[i], Integer.MAX_VALUE);
			for (int j=0; j<c; j++) {
				graph[i][j] = s.charAt(j);
			}
		}
		step[bx][by] = 0;
		
		int t = sc.nextInt();
		
		int [] tx = new int[t];
		int [] ty = new int[t];
		
		for (int i=0; i<t; i++) {
			tx[i] = sc.nextInt();
			ty[i] = sc.nextInt();
		}
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		xq.add(bx);
		yq.add(by);
		
		while (!xq.isEmpty()) {
			int x = xq.pop();
			int y = yq.pop();
			
			if (x+1<r && graph[x+1][y] == 'O' && step[x+1][y] > step[x][y]+1) {
				step[x+1][y] = step[x][y] + 1;
				xq.add(x+1);
				yq.add(y);
			}
			if (x-1>=0 && graph[x-1][y] == 'O' && step[x-1][y] > step[x][y]+1) {
				step[x-1][y] = step[x][y] + 1;
				xq.add(x-1);
				yq.add(y);
			}
			if (y+1<c && graph[x][y+1] == 'O' && step[x][y+1] > step[x][y]+1) {
				step[x][y+1] = step[x][y] + 1;
				xq.add(x);
				yq.add(y+1);
			}
			if (y-1>=0 && graph[x][y-1] == 'O' && step[x][y-1] > step[x][y]+1) {
				step[x][y-1] = step[x][y] + 1;
				xq.add(x);
				yq.add(y-1);
			}
		}
		
		long [] portals = new long[t];
		for (int i=0; i<t; i++) {
			portals[i] = step[tx[i]][ty[i]];
		}
		
		Arrays.sort(portals);
		
		System.out.println(Long.max(step[ex][ey]-portals[0], 0));
		
	}

}
