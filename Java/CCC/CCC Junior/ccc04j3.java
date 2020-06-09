import java.util.Scanner;
import java.util.Arrays;
public class ccc04j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] A = new String[n];
		String[] B = new String[m];
		for (int i=0;i<n;i++) {
			A[i] = sc.next();
		}
		for (int i=0;i<m;i++) {
			B[i] = sc.next();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.println(A[i]+" as "+B[j]);
			}
		}
	}
}