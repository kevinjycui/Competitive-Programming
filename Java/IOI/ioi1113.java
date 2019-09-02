import java.util.Scanner;

public class ioi1113 {
	
	public static long cost(int left, int right, long [] prefix) {
		int med = (left+right)/2;
		if ((right-left+1)%2==0) {
			return (prefix[right]-prefix[med])-(prefix[med]-prefix[left-1]);
		} else {
			return (prefix[right]-prefix[med])-(prefix[med-1]-prefix[left-1]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int l = sc.nextInt();
		long b = sc.nextLong();
		
		long [] x = new long [r+1];
		long [] prefix = new long [r+1];
		
		for (int i=1; i<=r; i++) {
			x[i] = sc.nextLong();
			prefix[i] = prefix[i-1]+x[i];
		}
		
		int right = 1;
		long ans = 0;
		
		for (int left=1; left<=r; left++) {
			while (right<r && cost(left, right+1, prefix)<=b) {
				right++;
			}
			ans = Math.max(ans, right-left+1);
		}
		
		System.out.println(ans);
		
	}

}
