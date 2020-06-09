import java.util.Scanner;

public class ccc18j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String y = sc.nextLine();
		String t = sc.nextLine();
		char [] c = y.toCharArray();
		char [] d = t.toCharArray();
		int count = 0;
		for (int i=0; i<y.length(); i++) {
			if (c[i]==d[i] && c[i]=='C') {
				count++;
			}
		}
		System.out.println(count);
	}
}