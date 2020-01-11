import java.util.Scanner;

public class dmopc19c4p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			String s = sc.next();
			
			int brack = 0;
			
			for (int c=0; c<s.length(); c++) {
				if (s.charAt(c) == '(')
					brack++;
				else if (s.charAt(c) == ')')
					brack--;
				if (brack < 0)
					break;
			}
			
			System.out.println(brack == 0 ? "YES" : "NO");
			
		}
		
	}

}
