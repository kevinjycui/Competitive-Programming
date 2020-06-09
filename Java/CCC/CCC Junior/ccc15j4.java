import java.util.Scanner;

public class ccc15j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int [] R = new int [101];
		int [] S = new int [101];
		int [] sum = new int [101];
		int T = 0;
		for (int i=0; i<M; i++) {
			char c = sc.next().charAt(0);
			int X = sc.nextInt();
			if (c=='R') {
				R[X] = T;
				S[X] = -1;
			} else if (c=='S') {
				S[X] = T;
				sum[X] += S[X]-R[X];
			} else if (c=='W') {
				T += X-2;
			}
			T++;
		}
		for (int i=1; i<101; i++) {
			if (S[i]==-1) {
				System.out.println(i+" "+-1);
			} else if (S[i]>0) {
				System.out.println(i+" "+sum[i]);
			}
		}
		
		
	}

}