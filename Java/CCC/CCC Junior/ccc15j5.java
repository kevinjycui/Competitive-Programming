import java.util.Scanner;

public class ccc15j5 {

	public static int [][] DP;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		n means how much pie
//		k means how many people
//		person 1 leaves
//		person 1 to left
//		k-1 people	n-1 pie
//		person 1 stays
//		k people 	n-k pie
		int n = sc.nextInt();
		int k = sc.nextInt();
		DP = new int[n+1][k+1];
		System.out.println(pie(n,k));
	}
	public static int pie(int n, int k) {
		if (DP[n][k]!=0) {
			return DP[n][k];
		}
		if (k==1) {
			return 1;
		} else if (n==k) {
			return 1;
		}else if (n<k) {
			return 0;
		} else { //generic equation
			DP[n][k] = pie(n-k,k) + pie(n-1,k-1);
			return DP[n][k];
		}
	}
}