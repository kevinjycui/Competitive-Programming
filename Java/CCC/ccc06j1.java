import java.util.Hashtable;
import java.util.Scanner;

public class ccc06j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		if (a==1) {
			count+=461;
		} else if (a==2) {
			count+=431;
		} else if (a==3) {
			count+=420;
		}
		if (b==1) {
			count+=100;
		} else if (b==2) {
			count+=57;
		} else if (b==3) {
			count+=70;
		}
		if (c==1) {
			count+=130;
		} else if (c==2) {
			count+=160;
		} else if (c==3) {
			count+=118;
		}
		if (d==1) {
			count+=167;
		} else if (d==2) {
			count+=266;
		} else if (d==3) {
			count+=75;
		}
		System.out.println("Your total Calorie count is "+count+".");

	}

}