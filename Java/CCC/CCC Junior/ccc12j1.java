import java.util.Scanner;

public class ccc12j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int speed = sc.nextInt();
		int S = speed - limit;
		int F = 0;
		if (S<=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else { 
			if (S>0 && S<=20) {
				F = 100;
			} else if (S>20 && S<=30) {
				F = 270;
			} else if (S>30) {
				F = 500;
			}
			System.out.println("You are speeding and your fine is $"+F+".");
		}

	}

}