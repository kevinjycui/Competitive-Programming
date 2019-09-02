import java.util.Arrays;
import java.util.Scanner;

public class wc151j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N%M==0) {
			int n = N/M;
			System.out.println(M+" group(s) of "+n);
		}else {
			int n = N/M;
			int r = N%M;
			System.out.println((M-r)+" group(s) of "+n);
			System.out.println(r+" group(s) of "+(n+1));
		}


	}
}