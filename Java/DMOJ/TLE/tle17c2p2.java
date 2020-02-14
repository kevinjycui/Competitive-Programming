import java.util.Arrays;
import java.util.Scanner;

public class tle17c2p2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();

		int [] u = new int [500003];

		for (int i=1; i<=k; i++)
			u[i] = sc.nextInt();

		Arrays.parallelSort(u, 1, k+1);

		u[k+1] = Integer.MAX_VALUE;

		int n = sc.nextInt();

		for (int j=0; j<n; j++) {

			int f = sc.nextInt();

			int l = 0;
			int r = k+1;
			int mid = 0;
			
			while (l <= r) {

				mid = (l+r)/2;

				if (u[mid] < f && u[mid+1] > f)
					break;

				if (u[mid] > f)
					r = mid-1;

				else
					l = mid+1;

			}

			System.out.println(f-mid);

		}

	}

}