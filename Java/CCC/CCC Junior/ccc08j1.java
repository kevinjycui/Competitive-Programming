import java.util.Scanner;

public class ccc08j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextInt();
		double h = sc.nextDouble();
		double BMI = w/(h*h);
		if (BMI>25) {
			System.out.println("Overweight");
		} else if (BMI>=18.5 && BMI<=25) {
			System.out.println("Normal weight");
		} else if (BMI<18.5) {
			System.out.println("Underweight");
		}

	}

}