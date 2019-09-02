import java.util.Scanner;
import java.util.Stack;

public class ccc05j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<String> A= new Stack<String>();

		while (true) {
			String c = sc.nextLine();
			if (c.equals("SCHOOL")) {
				break;
			}
			A.push(c);
		}
		while (true) {
			String D = A.pop();
			String Direction = "";
			if (D.equals("R")) {
				Direction = "LEFT";
			} else if (D.equals("L")) {
				Direction = "RIGHT";
			}
			if (A.isEmpty()) {
				System.out.println("Turn "+Direction+" into your HOME.");
				break;
			}
			String street = A.pop();
			System.out.println("Turn "+Direction+" onto "+street+" street.");
		}
	}
}