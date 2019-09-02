import java.util.*;
public class ccc04j4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		String msg = sc.nextLine();
		
		String newS = "";
		for (int i=0; i<msg.length(); i++) {
			char c = msg.charAt(i);
			if (c>='A' && c<='Z') {
				newS += c;
			}
		}
		for (int i=0; i<newS.length(); i++) {
			int index = i%key.length();
			int shift = key.charAt(index)-'A';
			char newC = (char)(newS.charAt(i)+shift);
			if (newC>'Z') {
				newC = (char)(newC-26);
			}
			System.out.print(newC);
		}
		
		
	}

}