import java.util.Scanner;

public class ccc17j3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt()+1000;
		int b = sc.nextInt()+1000;
		int c = sc.nextInt()+1000;
		int d = sc.nextInt()+1000;
		int t = sc.nextInt();
		
		int distance = Math.abs(c-a) + Math.abs(d-b);
		if (t>=distance && (t-distance)%2 == 0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}

}