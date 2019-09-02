import java.util.Scanner;


public class ccc11s1 { //english or french

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sCount = 0;
		int tCount = 0;
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j)=='s' || s.charAt(j)=='S') {
					sCount++;
				} else if (s.charAt(j)=='t' || s.charAt(j)=='T') {
					tCount++;
				}
			}
		}
		if (sCount>tCount) {
			System.out.println("French");
		} else {
			System.out.println("English");
		}

	}
}