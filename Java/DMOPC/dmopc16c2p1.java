import java.util.Scanner;

public class dmopc16c2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double g = 0;
		for (int i=0; i<K; i++) {
			int t = sc.nextInt();
			if (t==1) {
				g+=0.5;
			} else if (t==2) {
				g+=1;
			} else if (t==3) {
				g+=5;
			}
		}
		if (g<=N) {
			System.out.println("Continue");
		} else {
			System.out.println("Return");
		}
	}

}