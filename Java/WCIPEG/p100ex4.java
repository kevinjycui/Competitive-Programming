import java.util.Scanner;
public class p100ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		if (A.equals("MG")) {
			System.out.println("midget girls");
		}
		else if (A.equals("MB")) {
			System.out.println("midget boys");
		}
		else if (A.equals("JG")) {
			System.out.println("junior girls");
		}
		else if (A.equals("JB")) {
			System.out.println("junior boys");
		}
		else if (A.equals("SG")) {
			System.out.println("senior girls");
		}
		else if (A.equals("SB")) {
			System.out.println("senior boys");
		} else {
			System.out.println("invalid code");
		}
	}
}