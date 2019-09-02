import java.util.Scanner;
public class ccc07j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			String A = sc.nextLine();
			if (A.equals("CU")) {
				System.out.println("see you");
			}
			else if (A.equals(":-)")) {
				System.out.println("I'm happy");
			}
			else if (A.equals(":-(")) {
				System.out.println("I'm unhappy");
			}
			else if (A.equals(";-)")) {
				System.out.println("wink");
			}
			else if (A.equals(":-P")) {
				System.out.println("stick out my tongue");
			}
			else if (A.equals("(~.~)")) {
				System.out.println("sleepy");
			}
			else if (A.equals("TA")) {
				System.out.println("totally awesome");
			}
			else if (A.equals("CCC")) {
				System.out.println("Canadian Computing Competition");
			}
			else if (A.equals("CUZ")) {
				System.out.println("because");
			}
			else if (A.equals("TY")) {
				System.out.println("thank-you");
			}
			else if (A.equals("YW")) {
				System.out.println("you're welcome");
			}
			else if (A.equals("TTYL")) {
				System.out.println("talk to you later"); 
				break;
			}
			else { System.out.println(A);
			}
		}
	}
}