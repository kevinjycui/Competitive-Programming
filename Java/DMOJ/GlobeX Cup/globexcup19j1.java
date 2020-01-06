import java.util.Scanner;

public class globexcup19j1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int [] x = new int [1001];
		for (int i=1; i<=n; i++)
			x[i] = sc.nextInt();
		for (int i=1; i<=c; i++) {
			if (x[sc.nextInt()] == 0)
				m -= b;
			else
				m += a;
		}
		System.out.println(m);		
		
	}

}
