import java.util.Arrays;
import java.util.Scanner;

public class globexcup18s0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long [] x = new long [n];
		long [] y = new long [n];
		
		for (int i=0; i<n; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextLong();
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		long mx = x[n/2];
		long my = y[n/2];
		
		long time = 0;
		
		for (int i=0; i<n; i++)
			time += Math.abs(mx - x[i]) + Math.abs(my - y[i]);
		
		System.out.println(time);
		
	}

}
