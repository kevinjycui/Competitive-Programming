import java.util.Scanner;

public class ccc19s1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		
		int [][] a = {{1, 2}, {3, 4}};
		int v = 0;
		int h = 0;

		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == 'H') {
				h++;
			} else {
				v++;
			}
		}
		
		if (h%2 != 0) {
			int [] t = a[0];
			a[0] = a[1];
			a[1] = t;
		}
		if (v%2 != 0) {
			int [] t = {a[0][0], a[1][0]};
			a[0][0] = a[0][1];
			a[1][0] = a[1][1];
			a[0][1] = t[0];
			a[1][1] = t[1];
		}
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
