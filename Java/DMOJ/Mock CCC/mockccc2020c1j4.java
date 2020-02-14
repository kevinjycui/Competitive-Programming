import java.util.Scanner;

public class mockccc2020c1j4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String s = sc.next();
		
		long [] v = new long [1000001];
		
		for (int i=0; i<n; i++)
			v[i] = 1 << 30;
		
		int prev = -1;
		
		for (int i=0; i<n; i++) {
			
			if (s.charAt(i) == '1') { 
				prev = i;	
				v[i] = 0;
			}
			
			else if (prev != -1)	
				v[i] = i - prev;
		}
		
		prev = -1;
		
		for (int i=n-1; i>=0; i--) {
			
			if (s.charAt(i) == '1')
				prev = i;
			
			else if (prev != -1)
				v[i] = Math.min(v[i], prev - i);
			
		}
		
		long sum = 0;
		for (int i=0; i<n; i++)
			sum += v[i];
		
		System.out.println(sum);
		
	}

}