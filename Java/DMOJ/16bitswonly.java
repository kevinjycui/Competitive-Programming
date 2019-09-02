import java.util.*;
import java.math.*;

public class 16bitswonly
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger p = new BigInteger(sc.next());
			if (a.multiply(b).equals(p)) {
				System.out.println("POSSIBLE DOUBLE SIGMA");
			} else {
				System.out.println("16 BIT S/W ONLY");
			}
		}
	}
}