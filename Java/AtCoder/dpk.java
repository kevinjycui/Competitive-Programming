import java.util.Scanner;

public class dpk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [] a = new int [n];
		for (int i=0; i<n; i++)
			a[i] = sc.nextInt();
		
		boolean [] dp = new boolean [k+1];
		
		for (int i=1; i<=k; i++)
			for (int j=0; j<n; j++)
				if (i - a[j] >= 0 && !dp[i - a[j]])
					dp[i] = true;
		
//		for (int i=0; i<=k; i++)
//			System.out.print(dp[i]+" ");
//		System.out.println();
		
		System.out.println(dp[k] ? "First":"Second");
		
	}

}