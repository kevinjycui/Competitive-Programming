import java.util.Scanner;
public class ccc10j1  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int left=0; left<=5; left++) {
			for (int right=0; right<=5; right++) {
				if (left+right==N && left<=right) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}