import java.util.Scanner;

public class ccc15s2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		int a = sc.nextInt();
		
		int [] jerseys = new int [j+1];
		
		for (int i=1; i<=j; i++) {
			char c = sc.next().charAt(0);
			if (c == 'S') jerseys[i] = 0;
			else if (c == 'M') jerseys[i] = 1;
			else if (c == 'L') jerseys[i] = 2;
		}
		
		int count = 0;
		
		for (int i=0; i<a; i++) {
			char c = sc.next().charAt(0);
			int x = -1;
			if (c == 'S') x = 0;
			else if (c == 'M') x = 1;
			else if (c == 'L') x = 2;
			int num = sc.nextInt();
			if (num > 0 && num <= j && jerseys[num] >= x) {
				count++;
				jerseys[num] = -1;
			}
			
		}
		
		System.out.println(count);
		
	}

}
