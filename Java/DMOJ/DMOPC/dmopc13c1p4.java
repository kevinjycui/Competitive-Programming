import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class dmopc13c1p4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int k=0; k<t; k++) {
			int l = sc.nextInt();
			int w = sc.nextInt();
			
			char [][] graph = new char [w][l];
			int [][] step = new int [w][l];
			
			LinkedList<Integer> xq = new LinkedList<Integer>();
			LinkedList<Integer> yq = new LinkedList<Integer>();
			
			int ex = 0;
			int ey = 0;
			
			for (int i=0; i<w; i++) {
				String s = sc.next();
				Arrays.fill(step[i], Integer.MAX_VALUE);
				graph[i] = s.toCharArray();
				for (int c=0; c<s.length(); c++) {
					if (s.charAt(c) == 'C') {
						xq.add(i);
						yq.add(c);
						step[i][c] = 0;
					} else if (s.charAt(c) == 'W') {
						ex = i;
						ey = c;
					}
				}
			}
			
			while (!xq.isEmpty()) {
				int x = xq.pop();
				int y = yq.pop();
				
				if (x+1<w && graph[x+1][y] != 'X' && step[x+1][y] > step[x][y]+1) {
					xq.add(x+1);
					yq.add(y);
					step[x+1][y] = step[x][y]+1;
				}
				if (x-1>=0 && graph[x-1][y] != 'X' && step[x-1][y] > step[x][y]+1) {
					xq.add(x-1);
					yq.add(y);
					step[x-1][y] = step[x][y]+1;
				}
				if (y+1<l && graph[x][y+1] != 'X' && step[x][y+1] > step[x][y]+1) {
					xq.add(x);
					yq.add(y+1);
					step[x][y+1] = step[x][y]+1;
				}
				if (y-1>=0 && graph[x][y-1] != 'X' && step[x][y-1] > step[x][y]+1) {
					xq.add(x);
					yq.add(y-1);
					step[x][y-1] = step[x][y]+1;
				}
			}
			
			if (step[ex][ey] >= 60) {
				System.out.println("#notworth");
			} else {
				System.out.println(step[ex][ey]);
			}
		
		}
		
	}

}
