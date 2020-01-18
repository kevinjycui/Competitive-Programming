import java.util.Scanner;

public class ccc11s3 {
	
	static boolean solve(int m, int x, int y) {
		
		int sub = (int)Math.pow(5,  m-1);
		
		if ((x >= 2*sub && x < 3*sub && y >= sub && y < 2*sub) || (x >= sub && x < 4*sub && y >= 0 && y < sub))
			return true;
		if ((x >= sub && x < 2*sub && y >= sub && y < 2*sub) ||
				(x >= 2*sub && x < 3*sub && y >= 2*sub && y < 3*sub) ||
				(x >= 3*sub && x < 4*sub && y >= sub && y < 2*sub))
			return solve(m-1, x%sub, y%sub);
		
		return false;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=0; i<t; i++) {
			
			int m = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(solve(m, x, y) ? "crystal":"empty");
			
		}
		
	}

}