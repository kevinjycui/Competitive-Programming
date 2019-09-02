import java.util.Scanner;

public class nccc1j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while (true) {
			N++; 
			String S = ""+N;
			if (!S.contains("0")) {
				System.out.println(N);
				break;
			}
		}
	}
}