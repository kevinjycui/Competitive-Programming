import java.util.Scanner;

public class TheSum {
	
	static int n;
	static int sum;
	
	static int fibonacci(int a, int b, int i) {
		sum += a;
		if (i == n) return a;
		return fibonacci(a+b, a, i+1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = 0;
		fibonacci(0, 1, 0);
		
		System.out.println(sum);
		
	}

}
