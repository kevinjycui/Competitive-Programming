import java.util.Scanner;

public class ccc08s2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int r = sc.nextInt();
			int max = 0;
			if (r==0) {
				break;
			} else {

				for (int x=1; x<r; x++) {
					int y = (int)(Math.sqrt(Math.pow(r, 2)-Math.pow(x, 2)));
					max += y;
				}
				System.out.println(4*max+1+4*r);
			}
		}




	}

}