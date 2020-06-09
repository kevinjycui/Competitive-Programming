import java.util.Scanner;

public class ccc18s2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [][] graph = new int [n][n];

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		for (int t=0; t<4; t++) {
			boolean flag = true;
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (i<n-1 && !(graph[i][j] < graph[i+1][j])) {
						flag = false;
						break;
					}
					if (j<n-1 && !(graph[i][j] < graph[i][j+1])) {
						flag = false;
						break;
					}
					if (i==n-1 && j==n-1) {
						for (int r=0; r<n; r++)  {
							for (int c=0; c<n; c++) {
								System.out.print(graph[r][c]+" ");
							}
							System.out.println();
						}
						return;
					}
				}
				if (!flag) {
					break;

				}
			}
			rotate(n, graph);
		}

	}
	static void rotate(int N, int [][] mat) {
		for (int i=0; i<N/2; i++) {
			for (int j=i; j<N-i-1; j++) {
				int a = mat[i][j];
				mat[i][j] = mat[j][N-1-i];
				mat[j][N-1-i] = mat[N-1-i][N-1-j];
				mat[N-1-i][N-1-j] = mat[N-1-j][i];
				mat[N-1-j][i] = a;
			}
		}
	}
}