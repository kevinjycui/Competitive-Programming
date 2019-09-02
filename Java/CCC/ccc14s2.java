import java.util.*;

public class ccc14s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		LinkedList<String> l1 = new LinkedList<String>();
		LinkedList<String> l2 = new LinkedList<String>();
		for (int i=0; i<a; i++) {
			l1.add(sc.next());
		}
		for (int i=0; i<a; i++) {
			l2.add(sc.next());
		}
		for (int i=0; i<a; i++) {
			String name1 = l1.get(i);
			String partner1 = l2.get(i);

			int index = l2.indexOf(name1);
			String partner2 = l1.get(index);
			if (!partner1.equals(partner2) || name1.equals(partner1)) {
				System.out.println("bad");
				return;
			}
		}
		System.out.println("good");

	}
}