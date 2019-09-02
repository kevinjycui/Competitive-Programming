import java.util.*;

public class ccc17s1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] a = new int [t];
		int [] b = new int [t];
		for (int i=0; i<t; i++) {
			a[i] = sc.nextInt();
		}
		for (int i=0; i<t; i++) {
			b[i] = sc.nextInt();
		}
		int k = 0;
		int suma = 0;
		int sumb = 0;
		for (int i=0; i<t; i++) {
			suma += a[i];
			sumb += b[i];
			if (suma == sumb) {
				k = i+1;
			}
		}
		System.out.println(k);
	}
}