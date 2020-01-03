import java.math.BigInteger;
import java.util.Scanner;

public class modinv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.next());
		BigInteger m = new BigInteger(sc.next());
		
		System.out.println(a.modInverse(m));
		
	}

}
