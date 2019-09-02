import java.util.Scanner;
public class p287ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String p ="";
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			int b = sc.nextInt();
			b = Math.abs(b);
			p = Integer.toString(b);
			int f = p.length();
			System.out.println(f);
		}
		
	}
	
}