import java.util.*;

public class ccc13j4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int c = sc.nextInt();
		int [] chores = new int [c];
		for (int i=0; i<c; i++) {
			chores[i] = sc.nextInt();
		}
		int sum = 0;
		int count = 0;
		Arrays.sort(chores);
		int ans = 0;
		for (int i=0; i<c; i++) {
			sum += chores[i];

			if (sum<=t) {
				ans = i+1;
			}

		}
		
		System.out.println(ans);
	}
}