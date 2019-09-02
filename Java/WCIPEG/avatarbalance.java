import java.util.Scanner;

public class avatarbalance {
	public static int n;
	public static int [] a;
	public static void main(String[] args) {
		//dfs
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		a = new int [n];
		for (int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(dfs(0,0));

	}
	static int dfs(int pos, int sum) {
		if(pos==n) {
			return Math.abs(sum);
		}
		return Math.min(dfs(pos+1, sum+a[pos]),dfs(pos+1,sum-a[pos]));

	}

}