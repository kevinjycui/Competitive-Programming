import java.util.Scanner;

public class dmopc16c1p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int [N];
		int count = 0;
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if (A[i]%2==i%2) {
				count++;
			}
		}
		System.out.println(count);
	}

}