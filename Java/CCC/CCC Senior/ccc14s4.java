import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ccc14s4 {
	static class line implements Comparable<line> {
		int tint;
		int x;
		int y_start;
		int y_end;
		public line(int X, int S, int E, int T) {
			tint = T;
			x = X;
			y_start = S;
			y_end = E;
		}
		public int compareTo(line o) {
			return x-o.x;
		}
		public String toString() {
			String s = "";
			return "("+x +" "+y_start+" "+y_end+" "+tint+")";
		}

	}
	static class point implements Comparable<point> {
		int y;
		int tint;
		public point(int Y, int T) {
			y = Y;
			tint = T;
		}
		public int compareTo(point o) {
			return y-o.y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		line [] lines = new line[2005];
		for (int l=0; l<n; l++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), t = sc.nextInt();
			lines[2*l] = new line(x1, y1, y2, t);
			lines[2*l+1] = new line (x2, y1, y2, -t);
		}
		Arrays.sort(lines, 0, 2*n);
		ArrayList<point> A = new ArrayList<point>();
		
		long ans = 0;
		for (int l=0; l<2*n-1; l++) {
			A.add(new point(lines[l].y_start, lines[l].tint));
			A.add(new point(lines[l].y_end, -lines[l].tint));
			Collections.sort(A);
			int sum = 0;
			for (int l2=0; l2<A.size()-1; l2++) {
				sum+=A.get(l2).tint;
				if (sum>=k) {
					ans+=1L*(A.get(l2 + 1).y - A.get(l2).y) * (lines[l+1].x-lines[l].x);
				}
			}
		}
		System.out.println(ans);
		System.exit(0);
	}

}