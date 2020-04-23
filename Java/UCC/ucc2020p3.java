import java.util.Scanner;

public class ucc2020p3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int t = sc.nextInt();
		int [] tractors = new int [201];
		
		for (int i=0; i<t; i++)
			tractors[i] = sc.nextInt();
		
		int m = sc.nextInt();
		String trees = sc.next();
		
		int p = 0;
		int max = 0;
		
		for (int i=0; i<=m; i++) {
			if (i == m || trees.charAt(i) == '1') {
				max = Math.max(max, i - p - 1);
				p = i;
			}
		}
		
		int ti = 0;
		while (tractors[ti] <= max)
			ti++;
				
		System.out.println((int)Math.ceil(((double)h)/tractors[ti-1])%1000);

	}

}
