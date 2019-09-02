import java.util.Scanner;

public class ccc18j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (a==8 || a==9) {
			if (b==c) {
				if (d==8 || d==9) {
					System.out.println("ignore");
				} else {
					System.out.println("answer");
				}
			} else {
				System.out.println("answer");
			}
		} else {
			System.out.println("answer");
		}
	}
}