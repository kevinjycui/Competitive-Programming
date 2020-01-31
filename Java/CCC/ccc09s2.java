import java.util.HashSet;
import java.util.Scanner;

public class ccc09s2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashSet<String> combos = new HashSet<String>();

		int r = sc.nextInt();
		int l = sc.nextInt();

		String [] board = new String [r];
		sc.nextLine();

		for (int i=0; i<r; i++)
			board[i] = sc.nextLine().replaceAll(" ", "");

		for (int i=0; i<r; i++) {
			
			String line = board[i];

			for (int k=i+1; k<r; k++) {

				String result = "";
				
				for (int j=0; j<l; j++)
					result += line.charAt(j) == board[k].charAt(j) ? "0":"1";

				line = result;

			}

			combos.add(line);

		}

		System.out.println(combos.size());

	}

}