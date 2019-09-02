import java.util.Scanner;

public class nccc3j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i=0; i<N; i++) {
			int a = sc.nextInt();
			sum+=a;
		}
		System.out.println(sum);
	}

}