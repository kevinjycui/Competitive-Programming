import java.util.Arrays;
import java.util.Scanner;

public class ccc16s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int q = sc.nextInt();
		int n = sc.nextInt();
		int [] p = new int [n];
		int [] d = new int [n];
		for (int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(p);
		Arrays.sort(d);
		int m =0;
		if (q==1) {
			for (int i=0; i<n; i++) {
				if (p[i]>=d[i]) {
					m = m+p[i]; 
				} else {
					m = m+d[i];
				}
			}
		} else if (q==2) {
			for (int i=0; i<n; i++) {
				if (p[i]>=d[n-1-i]) {
					m = m+p[i]; 
				} else {
					m = m+d[n-1-i];
				}
			}
		}
		System.out.println(m);
	}

}