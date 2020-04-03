import java.util.Arrays;
import java.util.Scanner;

public class ccc20s1 {
	
	static class Data implements Comparable<Data> {
		double time;
		double pos;
		
		public Data(double t, double p) {
			time = t;
			pos = p;
		}

		public int compareTo(Data o) {
			return (int)(time-o.time);
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Data [] a = new Data[100001];
		
		for (int i=0; i<n; i++)
			a[i] = new Data(sc.nextDouble(), sc.nextDouble());
		
		Arrays.sort(a, 0, n);
		
		double max = 0;
		
		for (int i=1; i<n; i++)
			max = Math.max(max, Math.abs(a[i].pos - a[i-1].pos)/(a[i].time - a[i-1].time));
		
		System.out.println(max);

	}

}
