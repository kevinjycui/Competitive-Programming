import java.util.Scanner;

public class ccc13s5 {
		
	static int findMin(int v, int c) {
				
		if (v == 1)
			return c;
				
		for (int i=2; i*i<=v; i++)		
			if (v%i == 0)
				return findMin(v - v/i, c + (v - v/i)/(v/i));
		
		return findMin(v - 1, c + v - 1);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(findMin(n, 0));
		
	}

}
