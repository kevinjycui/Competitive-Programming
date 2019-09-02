import java.util.Scanner;

public class mockccc19j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean flag = false;
		for (int i=0; i<7; i++) {
			String s = sc.nextLine();
			if (s.equals("J")) {
				if (!flag) {
					count++;
					flag = true;
				}
			} else {
				flag = false;
			}
		}
		System.out.println(count);
	}

}