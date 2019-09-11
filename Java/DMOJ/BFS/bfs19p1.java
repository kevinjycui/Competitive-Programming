import java.util.Scanner;

public class bfs19p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [] o = new int [n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				int x = sc.nextInt();
				if (x==1 || x==10) {
					o[i]++;
				}
			}
		}
		
		int min = Integer.MAX_VALUE;
		int ans = -1;
		
		for (int i=0; i<n; i++) {
			if (o[i] < min) {
				min = o[i];
				ans = i+1;
			}
		}
		
		System.out.println(ans);
		
	}

}