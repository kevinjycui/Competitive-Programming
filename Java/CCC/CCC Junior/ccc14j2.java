import java.util.Scanner;

public class ccc14j2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s = sc.next();
		int countA = 0;
		int countB = 0;
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c=='A') {
				countA++;
			} else if (c=='B') {
				countB++;
			}
		}
		if (countA>countB) {
			System.out.println("A");
		} else if (countA<countB) {
			System.out.println("B");
		} else if (countA==countB) {
			System.out.println("Tie");
		}
		
	}

}