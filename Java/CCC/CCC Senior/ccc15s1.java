import java.util.Scanner;
import java.util.Stack;

public class ccc15s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		Stack <Integer> st = new Stack<>();
		for (int i=0; i<k; i++) {
			int t = sc.nextInt();
			if (t!=0) {
				st.push(t);
			} else {
				st.pop();
			}
		}
		int sum = 0;
		while (!st.isEmpty()) {
			sum = sum + st.pop();
		}
		System.out.println(sum);
	}
}