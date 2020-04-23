import java.util.Scanner;

public class ucc2020p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = sc.next();
		String t = sc.next();
		
		int count = 0;
		
		for (int i=0; i<n; i++)
			if (s.charAt(i) == '0' && t.charAt(i) == '0') count++;
		
		System.out.println(count%1000);
		
	}

}
