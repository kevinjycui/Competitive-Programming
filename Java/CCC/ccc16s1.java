import java.util.LinkedList;
import java.util.Scanner;

public class ccc16s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String S2 = sc.nextLine();
		LinkedList<Character> l = new LinkedList<Character>();
		for (int i=0; i<S.length(); i++) {
			l.add(S2.charAt(i));
		}
		if (S.length()!=S2.length()) {
			System.out.println("N");
		}else {
			boolean flag = true;
			for (int i=0; i<S.length(); i++) {
				char c = S.charAt(i);
				int index = l.indexOf(c);
				if (index==-1) {
					int index2 = l.indexOf('*');
					if (index2==-1) {
						flag = false;
						break;
					} else {
						l.remove(index2);
					}
				}else {
					l.remove(index);
				}
			}
			if (flag) {
				System.out.println("A"); 
			} else {
				System.out.println("N");
			}
		}
	}

}
