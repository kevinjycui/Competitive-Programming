import java.util.Hashtable;
import java.util.Scanner;
public class ccc06j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hashtable<Character,String> table = new Hashtable<Character,String>();
		table.put('a', "2");
		table.put('b', "22");
		table.put('c', "222");
		table.put('d', "3");
		table.put('e', "33");
		table.put('f', "333");
		table.put('g', "4");
		table.put('h', "44");
		table.put('i', "444");
		table.put('j', "5");
		table.put('k', "55");
		table.put('l', "555");
		table.put('m', "6");
		table.put('n', "66");
		table.put('o', "666");
		table.put('p', "7");
		table.put('q', "77");
		table.put('r', "777");
		table.put('s', "7777");
		table.put('t', "8");
		table.put('u', "88");
		table.put('v', "888");
		table.put('w', "9");
		table.put('x', "99");
		table.put('y', "999");
		table.put('z', "9999");
		while (true) {
			String S = sc.nextLine();
			if (S.equals("halt")) {
				break;
			}
			int total = 0;
			String A = "";
			for (int i=0;i<S.length(); i++) {
				char c = S.charAt(i);
				String mapV = table.get(c);
				if (mapV.substring(0,1).equals(A)) {
					total = total + 2;
				}
				int t = mapV.length();
				total = total + t;
				A = mapV.substring(0,1);
			}
			System.out.println(total);

		}

	}
}