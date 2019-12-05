import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dmopc19c3p1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int [] nums = new int [200002];
		int max = 0;
		int ind = 0;

		ArrayList<Integer> modes [] = new ArrayList[200002];

		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			nums[a+100000]++;
			if (nums[a+100000] == max) {
				modes[ind].add(a);
			}
			else if (nums[a+100000] > max) {
				max = nums[a+100000];
				ind++;
				modes[ind] = new ArrayList<Integer>();
				modes[ind].add(a);
			}
		}

		Collections.sort(modes[ind]);

		for (int i=0; i<modes[ind].size(); i++)
			System.out.print(modes[ind].get(i)+" ");

	}

}
