import java.util.Scanner;

public class dmopc16c3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int M = sc.nextInt();
		
		if (S.equals("Infront")) {
			System.out.println(N-M);
		} else if (S.equals("Behind")) {
			System.out.println(N+M);
		}
	}

}