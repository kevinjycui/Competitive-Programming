import java.util.Scanner;

public class nccc1j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean odd = true;
		for (int len=1; len<=s.length(); len++) {
			for (int j=0; j<=s.length()-len; j++) {
				String x = s.substring(j, j+len);
				if (isPalindrome(x)) {
					if (x.length()%2==0) {
						odd = false;
						break;	
					} break;
				}
			}
		}
		if (odd==true) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}


	}
	public static boolean isPalindrome(String a) {
		for (int i=0; i<a.length(); i++) {
			char forward = a.charAt(i);
			char backward = a.charAt(a.length()-i-1);
			if (forward!=backward) {
				return false;
			}
		}
		return true;
	}
}