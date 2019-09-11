import java.util.Scanner;

public class mockccc19j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i=0; i<5; i++) {
			String s = sc.nextLine();
			if (s.equals("P")) {
				count++;
			}
		}
		System.out.println(count);

	}

}