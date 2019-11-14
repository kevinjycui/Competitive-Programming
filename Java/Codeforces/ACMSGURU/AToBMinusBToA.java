import java.math.BigInteger;
import java.util.Scanner;

public class AToBMinusBToA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.pow(b.intValue()).subtract(b.pow(a.intValue())));
		
	}

}
