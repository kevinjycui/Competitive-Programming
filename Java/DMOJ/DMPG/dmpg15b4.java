import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dmpg15b4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			int c = sc.nextInt();
			if (c > 0)
				pos.add(c);
			else if (c < 0)
				neg.add(c);
		}
		
		Collections.sort(neg);
		
		int prod = 0;
		
		if (pos.size() > 0 || neg.size() > 0 && !(neg.size() == 1 && pos.size() == 0 && n > 1))
			prod = 1;
		
		for (int i=0; i<pos.size(); i++)
			prod *= pos.get(i);
		
		for (int i=0; i<neg.size(); i++)
			if ((i != neg.size()-1 || neg.size() % 2 == 0) || (neg.size() == 1 && pos.size() == 0))
				prod *= neg.get(i);
		
		System.out.println(prod);
		
	}

}
