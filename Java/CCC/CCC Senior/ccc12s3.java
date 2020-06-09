import java.util.Arrays;
import java.util.Scanner;

public class ccc12s3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] a = new int [1001];
		
		int max1 = 0;
		int max2 = 0;
		
		for (int i=0; i<n; i++)
			a[sc.nextInt()]++;
			
		for (int m=1; m<=1000; m++) {
			if (a[m] == 0)
				continue;
			if (max1 <= a[m]) {
				max2 = max1;
				max1 = a[m];
			} else if (a[m] < max1 && a[m] > max2)
				max2 = a[m];
//			System.out.println(max1+" "+max2);
		}
		

		int ans = 0;
		
		for (int i=1; i<=1000; i++)
			if (a[i] > 0)
				for (int j=i+1; j<=1000; j++)
					if ((a[i] == max1 && a[j] == max2) || (a[i] == max2 && a[j] == max1))
						ans = Math.max(ans, Math.abs(i-j));		
		
		System.out.println(ans);
		
	}

}