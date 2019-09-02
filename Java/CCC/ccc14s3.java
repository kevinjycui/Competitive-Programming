import java.util.*;

public class ccc14s3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0; i<t; i++) {
			int n = sc.nextInt();
			Stack<Integer> mount = new Stack<Integer>();
			int [] order = new int [n];
			for (int j=0; j<n; j++) {
				order[j] = sc.nextInt();
				mount.add(order[j]);
			}
			Arrays.parallelSort(order);
			Stack<Integer> branch = new Stack<Integer>();
			int index = 0;
			while (index<n) {
				int next = -1;
				int nextBranch = -1;
				if (!mount.isEmpty()) {
					next = mount.pop();
				}
				if (!branch.isEmpty()) {
					nextBranch = branch.pop();
				}
				if (next == order[index]) {
					if (nextBranch != -1) {
						branch.add(nextBranch);
					}
					index++;
				} else if (nextBranch == order[index]) {
					if (next != -1) {
						mount.add(next);
					}
					index++;
				} else {
					if (nextBranch!=-1) {
						branch.add(nextBranch);
					}
					if (next!=-1) {
						branch.add(next);
					} else {
						break;
					}
				}
			}
			if (mount.isEmpty() && branch.isEmpty()) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
		}
	}
}
