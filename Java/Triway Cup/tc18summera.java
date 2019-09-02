import java.util.Scanner;

public class tc18summera {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long b = sc.nextInt();
		long a = sc.nextInt();
		
		long left = 0;
		long right = n;
		long med = (left+right)/2;
		
		while (left!=right) {
			med = (left+right)/2;
			if (f(n, b, a, med)<=f(n, b, a, med+1)) {
				left = med+1;
			}
			else if (f(n, b, a, med)>=f(n, b, a, med+1)) {
				right = med;
			}
		}
		System.out.println(f(n, b, a, left));
	
	}
	
	public static long f(long n, long b, long a, long x) {
		return (b*x+a)*(n-x);
	}

}