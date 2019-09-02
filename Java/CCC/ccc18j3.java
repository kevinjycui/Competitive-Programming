import java.util.Scanner;

public class ccc18j3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] city = new int [5];
		city[1] = sc.nextInt();
		city[2] = sc.nextInt();
		city[3] = sc.nextInt();
		city[4] = sc.nextInt();
		int [][] dist = new int [5][5];
		dist[0][0] = 0;
		dist[1][1] = 0;
		dist[2][2] = 0;
		dist[3][3] = 0;
		dist[4][4] = 0;
		dist[0][1] = city [1];
		for (int i=2; i<=4; i++) {
			dist[0][i] = dist[0][i-1] + city[i];
		}
		dist[1][2] = city[2];
		for (int i=3; i<=4; i++) {
			dist[1][i] = dist[1][i-1] + city[i];
		}
		dist[2][3] = city [3];
		dist[2][4] = city[3]+city[4];
		dist[3][4] = city [4];
		//lmao
		dist[1][0] = city[1];
		for (int i=2; i<=4; i++) {
			dist[i][0] = dist[i-1][0] + city[i];
		}
		dist[2][1] = city[2];
		for (int i=3; i<=4; i++) {
			dist[i][1] = dist[i-1][1] + city[i];
		}
		dist[3][2] = city [3];
		dist[4][2] = city[3]+city[4];
		dist[4][3] = city [4];
		

		for (int r=0; r<=4; r++) {
			for (int c=0; c<=4; c++) {
				System.out.print(dist[r][c]+" ");
			}
			System.out.println();
		}
	}

}