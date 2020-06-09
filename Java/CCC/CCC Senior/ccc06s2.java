import java.util.Scanner;

public class ccc06s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String a = sc.nextLine();
		String b = sc.nextLine();
		for (int i=0; i<b.length(); i++) {
			char c = b.charAt(i);
			int indexC = a.indexOf(c);
			if (indexC==-1) {
				System.out.print(".");
			} else {
				System.out.print(s.charAt(indexC));
			}

		}
	}

}