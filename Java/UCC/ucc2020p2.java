import java.util.Scanner;

public class ucc2020p2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int min = 1 << 30;
		
		for (int i=0; i<n; i++) {
			int m = sc.nextInt();
			int count = 0;
			for (int j=0; j<m; j++)
				count += sc.nextInt();
			min = Math.min(min, count);
		}
		
		System.out.println(min%1000);
		
	}

}
