import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc08s3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int k=0; k<t; k++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			char [][] graph = new char [r][c];
			int [][] step = new int [r][c];
			
			for (int i=0; i<r; i++) {
				String s = sc.next();
				graph[i] = s.toCharArray();
				Arrays.fill(step[i], Integer.MAX_VALUE);
			}
			step[0][0] = 1;
			
			LinkedList<Integer> xq = new LinkedList<Integer>();
			LinkedList<Integer> yq = new LinkedList<Integer>();
			
			xq.add(0);
			yq.add(0);
			
			while (!xq.isEmpty()) {
				int x = xq.pop();
				int y = yq.pop();
				
				if ((graph[x][y] == '+' || graph[x][y] == '|') && x+1<r && graph[x+1][y] != '*' && step[x+1][y] > step[x][y]+1) {
					step[x+1][y] = step[x][y] + 1;
					xq.add(x+1);
					yq.add(y);
				}
				if ((graph[x][y] == '+' || graph[x][y] == '|') && x-1>=0 && graph[x-1][y] != '*' && step[x-1][y] > step[x][y]+1) {
					step[x-1][y] = step[x][y] + 1;
					xq.add(x-1);
					yq.add(y);
				}
				if ((graph[x][y] == '+' || graph[x][y] == '-') && y+1<c && graph[x][y+1] != '*' && step[x][y+1] > step[x][y]+1) {
					step[x][y+1] = step[x][y] + 1;
					xq.add(x);
					yq.add(y+1);
				}
				if ((graph[x][y] == '+' || graph[x][y] == '-') && y-1>=0 && graph[x][y-1] != '*' && step[x][y-1] > step[x][y]+1) {
					step[x][y-1] = step[x][y] + 1;
					xq.add(x);
					yq.add(y-1);
				}
			}
			
			if (step[r-1][c-1] != Integer.MAX_VALUE) { 
				System.out.println(step[r-1][c-1]);
			} else {
				System.out.println(-1);
			}
		}
	}

}
