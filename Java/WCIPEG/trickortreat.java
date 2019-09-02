import java.util.Arrays;
import java.util.Scanner;

public class trickortreat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int total = 0;
		int [] a = new int [n];
		for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int sum = 0;
		for (int i=0; i<n; i++) {
			if (i!=0) { 
				total++;
			} if (total+a[i]>d) {
				break;
			} else {
				total+=a[i];
				sum++;
			}
		}
		System.out.println(sum);

	}

}
