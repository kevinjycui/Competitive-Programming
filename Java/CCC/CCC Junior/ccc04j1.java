import java.util.Scanner;

public class ccc04j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		for (int i=s; i>=(int)Math.cbrt(s); i--) {
			if (i*i<=s) {
				System.out.println("The largest square has side length "+i+".");
				break;
			}
		}

	}

}
