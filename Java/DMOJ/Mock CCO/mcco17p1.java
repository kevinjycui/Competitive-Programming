import java.util.Scanner;
import java.util.TreeSet;

public class mcco17p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] cards = new int [n];

		for (int i=0; i<n; i++) {
			cards[i] = sc.nextInt();
		}

		Integer sec = 0;
		int count = 0;

		TreeSet<Integer> t = new TreeSet<Integer>();

		t.add(cards[0]);
		int took = 0;

		while (sec<n) {
			count++;
			if (t.higher(took)!=null) {
				took = t.higher(took);
				for (int i=sec+1; i<=sec+took; i++) {
					if (i<n) {
						t.add(cards[i]);
					}
				}
			} else {
				count = -1;
				break;
			}
			sec += took;
		}

		System.out.println(count);
	}

}