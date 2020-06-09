import java.util.Scanner;

public class ccc09s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (int i=a; i<=b; i++) {
			double sqrt = Math.sqrt(i);
			if ((int)sqrt==sqrt) {
				double cbrt = Math.cbrt(i);
				if ((int)cbrt==cbrt) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}