import java.util.Arrays;
import java.util.Scanner;

public class ioi9411 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] base = new int [101];
		int [] temp = new int [101];
		
		for (int i=1; i<=n; i++) {
						
			for (int j=0; j<i; j++) 
				temp[j] = sc.nextInt();
			
			for (int j=i-1; j>=0; j--)
				base[j] = Math.max(base[j] + temp[j], base[Math.max(j-1, 0)] + temp[j]);
			
		}
		
		Arrays.sort(base, 0, n);
		
		System.out.println(base[n-1]);
		
	}

}