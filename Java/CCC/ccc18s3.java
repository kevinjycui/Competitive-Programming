import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc18s3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		char [][] graph = new char [r][c];
		
		int [][] step = new int [r][c];
		
		for (int i=0; i<r; i++) {
			String s = sc.next();
			graph[i] = s.toCharArray();
			Arrays.fill(step[i], Integer.MAX_VALUE);
		}
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		boolean flag = false;
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (graph[i][j] == 'C') {
					for (int k=j; k<c; k++) {
						if (graph[i][k] == '.') {
							graph[i][k] = 'X';
						} else if (graph[i][k] == 'S') {
							flag = true;
						} else if (graph[i][k] == 'W') {
							break;
						}
					}
					for (int k=j; k>=0; k--) {
						if (graph[i][k] == '.') {
							graph[i][k] = 'X';
						} else if (graph[i][k] == 'S') {
							flag = true;
						} else if (graph[i][k] == 'W') {
							break;
						}
					}
					for (int k=i; k<r; k++) {
						if (graph[k][j] == '.') {
							graph[k][j] = 'X';
						} else if (graph[k][j] == 'S') {
							flag = true;
						} else if (graph[k][j] == 'W') {
							break;
						}
					}
					for (int k=i; k>=0; k--) {
						if (graph[k][j] == '.') {
							graph[k][j] = 'X';
						} else if (graph[k][j] == 'S') {
							flag = true;
						} else if (graph[k][j] == 'W') {
							break;
						}
					}
				} else if (graph[i][j] == 'S') {
					step[i][j] = 0;
					xq.add(i);
					yq.add(j);
				}
			}
		}
		
		while (!xq.isEmpty() && !flag) {
			int x = xq.pop();
			int y = yq.pop();
			if ((graph[x][y] == 'S' || graph[x][y] == '.' || graph[x][y] == 'L') && y-1>=0) {
				if (graph[x][y-1] == '.' && step[x][y-1] > step[x][y] + 1) {
					step[x][y-1] = step[x][y] + 1;
					xq.add(x);
					yq.add(y-1);
				} else if ((graph[x][y-1] == 'L' || graph[x][y-1] == 'R' || graph[x][y-1] == 'U' || graph[x][y-1] == 'D') && step[x][y-1] > step[x][y]) {
					step[x][y-1] = step[x][y];
					xq.add(x);
					yq.add(y-1);
				}
			}
			if ((graph[x][y] == 'S' || graph[x][y] == '.' || graph[x][y] == 'R') && y+1<c) {
				if (graph[x][y+1] == '.' && step[x][y+1] > step[x][y] + 1) {
					step[x][y+1] = step[x][y] + 1;
					xq.add(x);
					yq.add(y+1);
				} else if ((graph[x][y+1] == 'L' || graph[x][y+1] == 'R' || graph[x][y+1] == 'U' || graph[x][y+1] == 'D') && step[x][y+1] > step[x][y]) {
					step[x][y+1] = step[x][y];
					xq.add(x);
					yq.add(y+1);
				}
			}
			if ((graph[x][y] == 'S' || graph[x][y] == '.' || graph[x][y] == 'U') && x-1>=0) {
				if (graph[x-1][y] == '.' && step[x-1][y] > step[x][y] + 1) {
					step[x-1][y] = step[x][y] + 1;
					xq.add(x-1);
					yq.add(y);
				} else if ((graph[x-1][y] == 'L' || graph[x-1][y] == 'R' || graph[x-1][y] == 'U' || graph[x-1][y] == 'D') && step[x-1][y] > step[x][y]) {
					step[x-1][y] = step[x][y];
					xq.add(x-1);
					yq.add(y);
				}
			}
			if ((graph[x][y] == 'S' || graph[x][y] == '.' || graph[x][y] == 'D') && x+1<r) {
				if (graph[x+1][y] == '.' && step[x+1][y] > step[x][y] + 1) {
					step[x+1][y] = step[x][y] + 1;
					xq.add(x+1);
					yq.add(y);
				} else if ((graph[x+1][y] == 'L' || graph[x+1][y] == 'R' || graph[x+1][y] == 'U' || graph[x+1][y] == 'D') && step[x+1][y] > step[x][y]) {
					step[x+1][y] = step[x][y];
					xq.add(x+1);
					yq.add(y);
				}
			}
		}

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (graph[i][j] == '.' || graph[i][j] == 'X') {
					if (step[i][j] != Integer.MAX_VALUE) {
						System.out.println(step[i][j]);
					} else {
						System.out.println(-1);
					}
				}
			}
		}

	}
}