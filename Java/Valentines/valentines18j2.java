import java.util.Scanner;

public class valentines18j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int fin = 0;
		int count = 1;
		while (true) {
			fin = fin+X;
			if (fin*2>=N) {
				break;
			}
			X = X-Y;
			count++;

		}

		if (X<=0) {
			System.out.println("RIP");
		} else {
			System.out.println(count);
		}
	}

}