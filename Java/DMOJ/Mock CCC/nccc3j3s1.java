import java.util.Arrays;
import java.util.Scanner;

public class stringproblem {

	public static void nccc3j3s1(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] A = new int [26];
		String s = sc.next();
		for (int i=0; i<s.length(); i++) {
			A[s.charAt(i)-'a']++;
		}
		
		Arrays.sort(A);
		int sum = 0;
		for (int i=0; i<24; i++) {
			sum+=A[i];
		}
		System.out.println(sum);
	}

}