import java.util.Scanner;

public class mockccc19s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double d = 0;
		
		for (int i=0; i<n; i++) {
			d+=sc.nextInt();
		}
		d = d/n;
		
		System.out.printf("%.1f", d);
		System.out.println();
		
		
	}

}