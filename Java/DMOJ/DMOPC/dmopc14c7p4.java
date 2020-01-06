import java.util.Scanner;

public class dmopc14c7p4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		
		long val = 1;
		long inc = 1;
		
		while (n > val) {
			inc++;
			val += inc;
		}
		
		long sum = 0;
		
		for (long i=val; i>val-inc; i--)
			sum += i;
		
		System.out.println(sum);
		
	}

}
