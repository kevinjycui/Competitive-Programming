import java.util.Scanner;

public class dmopc17c2p1 {
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long minc = 0;
		
		for (int i=0; i<n; i++) {
			long c = sc.nextLong();
			long v = sc.nextLong();
			if (v > 0)
				minc += c;
		}
		
		System.out.println(minc);
				
	}

}