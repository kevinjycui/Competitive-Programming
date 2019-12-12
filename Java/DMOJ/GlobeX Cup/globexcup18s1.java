import java.util.Scanner;

public class globexcup18s1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] adj = new int [n];

		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x != 0)
				adj[x]++;
		}

		int count = 0;
		
		for (int j=0; j<n; j++) 
			if (adj[j] == 0)
				count++;

		System.out.println(count);
	}

}
