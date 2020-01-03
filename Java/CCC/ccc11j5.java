import java.util.Arrays;
import java.util.Scanner;

public class ccc11j5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] friends = new int [n+1];
		Arrays.fill(friends, 1);
		
		for (int i=1; i<n; i++)
			friends[sc.nextInt()] *= friends[i] + 1;
		
		System.out.println(friends[n]);
		
	}

}
