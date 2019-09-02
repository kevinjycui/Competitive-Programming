import java.util.Arrays;
import java.util.Scanner;

public class ccc17s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] a = new int [n];

		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		int [] a1 = new int [(n+1)/2];
		int [] a2 = new int [(n+1)/2];
		int z = 0;
		for (int i=(n+1)/2-1; i>=0; i--) {
			a1[z] = a[i];
			z++;
		}

		z=0;
		for (int i=(n+1)/2; i<n; i++) {
			a2[z] = a[i];
			z++;
		}

		for (int i=0; i<(n+1)/2; i++) {
			System.out.print(a1[i]+" ");
			if (a2[i]!=0) {
				System.out.print(a2[i]+" ");
			}
		}

	}

}