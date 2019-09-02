import java.util.Scanner;
public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ready");
		while (true) {
			String S = sc.nextLine();
			if (S.equals("  ")) {
				break;
			} else if (S.equals("bd")||S.equals("db")) {
				System.out.println("Mirrored pair");
			} else if (S.equals("pq")||S.equals("qp")) {
				System.out.println("Mirrored pair");
			} else {
				System.out.println("Ordinary pair");
			}
		}
	}
}