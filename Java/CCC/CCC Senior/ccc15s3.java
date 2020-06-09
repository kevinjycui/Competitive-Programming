import java.util.Scanner;
import java.util.TreeSet;

public class ccc15s3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int g = sc.nextInt();
		int p = sc.nextInt();

		int [] planes = new int [p];

		TreeSet<Integer> gates = new TreeSet<Integer>();
		
		for (int i=0; i<g; i++)
			gates.add(i+1);

		for (int i=0; i<p; i++) {
			planes[i] = sc.nextInt();
		}

		int count = 0;
		
		for (int i=0; i<p; i++) {
			try {
				gates.remove(gates.floor(planes[i]));
				count++;
			} 
			catch (NullPointerException e) {
				break;
			}
		}
		
		System.out.println(count);


	}

}
