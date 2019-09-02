import java.util.Scanner;

public class mockccc19s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] graph = new int [n*n+1];
		
		for (int i=1; i<=n*n; i++) {
			graph[i] = sc.nextInt();
		}
		
		int count = 0;

		for (int i=1; i<=n*n; i++) {
			if (graph[i]!=i) {
				count++;
			}
		}

		System.out.printf("%d\n",Math.round(Math.sqrt(count)));
		
	}

}