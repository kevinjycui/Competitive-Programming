import java.util.Arrays;
import java.util.Scanner;

public class valentines18j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float [] M = new float [t];
		for (int i=0; i<t; i++) {
			int N = sc.nextInt();
			M[i] = N/1000;
		}
		Arrays.sort(M);
		if (M[t-1]>10) {
			System.out.println("Something is wrong with these cuteness values");
		} else if (M[t-1]>1 && M[t-1]<=10) {
			System.out.println("Cuteness by definition is similarity to Cactus");
		} else {
			System.out.println("Cuteness by definition is similarity to Carol");
		}
		
	} 
}
