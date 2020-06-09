import java.util.Scanner;

public class ccc19s2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int q=0; q<t; q++) {
			int n = sc.nextInt();
			
			for (int i=2; i<2*n; i++) {
				if (isPrime(i) && isPrime(2*n-i)) {
					System.out.println(i+" "+(2*n-i));
					break;
				}	
			}
			
		}
	}
	
	static boolean isPrime(int a) {
		for (int i=2; i<=Math.sqrt(a); i++) {
			if (a%i == 0)
				return false;
		}
		return true;
	}

}