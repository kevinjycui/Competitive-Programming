import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long t = sc.nextInt();
		for (long a=0; a<t; a++) {
			long k = sc.nextInt();
			while (true) {
				k++;
				long number = (k)*(k)*(k);
				String product = Long.toString(number);
				if (endsWith888(product)) {
					System.out.println(k);
					break;
				} 
			}
		}
	}
	public static boolean endsWith888(String s) {
		if (s.endsWith("888")) {
			return true;
		} else {
			return false;
		}
	}
}