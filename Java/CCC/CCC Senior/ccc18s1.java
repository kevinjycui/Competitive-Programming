import java.util.Arrays;
import java.util.Scanner;

public class ccc18s1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double [] villages = new double [n];

		for (int i=0; i<n; i++) {
			villages[i] = (double) sc.nextInt();
		}
		Arrays.sort(villages);

		double [] diff = new double [n];
		Arrays.fill(diff, 0);
		
		for (int i=0; i<n-1; i++) {
			diff[i] += (villages[i+1] - villages[i])/2;
			diff[i+1] += (villages[i+1] - villages[i])/2;
		}
		
		diff[0] = Double.MAX_VALUE;
		diff[n-1] = Double.MAX_VALUE;
		
		Arrays.sort(diff);
		
		System.out.printf("%.1f", diff[0]);

	}

}