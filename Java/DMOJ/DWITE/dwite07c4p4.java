import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class dwite07c4p4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int t=0; t<5; t++) {
			char [][] graph = new char [10][10];
			int [][] step = new int [10][10];
			
			int bx = -1;
			int by = -1;
			int ex = -1;
			int ey = -1;
			
			for (int i=0; i<10; i++) {
				String s = sc.next();
				Arrays.fill(step[i], Integer.MAX_VALUE);
				for (int c=0; c<s.length(); c++) {
					if (s.charAt(c) == 'X') {
						if (bx == -1) {
							bx = i;
							by = c;
						} else {
							ex = i;
							ey = c;
						}
					}
					graph[i][c] = s.charAt(c);
				}
			}
			sc.next();
			
			step[bx][by] = 0;
			
			LinkedList<Integer> xq = new LinkedList<Integer>();
			LinkedList<Integer> yq = new LinkedList<Integer>();
			
			xq.add(bx);
			yq.add(by);
			
			while (!xq.isEmpty()) {
				int x = xq.pop();
				int y = yq.pop();
				
				if (x+1<10 && graph[x+1][y] != '#' && step[x+1][y] > step[x][y]+1) {
					xq.add(x+1);
					yq.add(y);
					step[x+1][y] = step[x][y]+1;
				}
				if (x-1>=0 && graph[x-1][y] != '#' && step[x-1][y] > step[x][y]+1) {
					xq.add(x-1);
					yq.add(y);
					step[x-1][y] = step[x][y]+1;
				}
				if (y+1<10 && graph[x][y+1] != '#' && step[x][y+1] > step[x][y]+1) {
					xq.add(x);
					yq.add(y+1);
					step[x][y+1] = step[x][y]+1;
				}
				if (y-1>=0 && graph[x][y-1] != '#' && step[x][y-1] > step[x][y]+1) {
					xq.add(x);
					yq.add(y-1);
					step[x][y-1] = step[x][y]+1;
				}
				if (x+1<10 && y+1<10 && graph[x+1][y+1] != '#' && step[x+1][y+1] > step[x][y]+1) {
					xq.add(x+1);
					yq.add(y+1);
					step[x+1][y+1] = step[x][y]+1;
				}
				if (x+1<10 && y-1>=0 && graph[x+1][y-1] != '#' && step[x+1][y-1] > step[x][y]+1) {
					xq.add(x+1);
					yq.add(y-1);
					step[x+1][y-1] = step[x][y]+1;
				}
				if (x-1>=0 && y-1>=0 && graph[x-1][y-1] != '#' && step[x-1][y-1] > step[x][y]+1) {
					xq.add(x-1);
					yq.add(y-1);
					step[x-1][y-1] = step[x][y]+1;
				}
				if (x-1>=0 && y+1<10 && graph[x-1][y+1] != '#' && step[x-1][y+1] > step[x][y]+1) {
					xq.add(x-1);
					yq.add(y+1);
					step[x-1][y+1] = step[x][y]+1;
				}
			}
			
			System.out.println(step[ex][ey]);
		}
	}

}