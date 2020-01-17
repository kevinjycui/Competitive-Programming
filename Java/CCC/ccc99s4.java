import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ccc99s4 {

	public static void main(String[] args) {

		FastReader sc = new FastReader();

		int n = sc.nextInt();

		for (int t=0; t<n; t++) {

			int r = sc.nextInt();
			int c = sc.nextInt();

			int pr = sc.nextInt();
			int pc = sc.nextInt();

			int kr = sc.nextInt();
			int kc = sc.nextInt();

			int [][] step = new int [101][101];
			for (int i=1; i<=r; i++)
				for (int j=1; j<=c; j++)
					step[i][j] = Integer.MAX_VALUE;

			step[kr][kc] = 0;

			LinkedList<Integer> xq = new LinkedList<Integer>();
			LinkedList<Integer> yq = new LinkedList<Integer>();

			xq.add(kr);
			yq.add(kc);

			while (!xq.isEmpty()) {

				int x = xq.pop();
				int y = yq.pop();
				
				if (step[x][y] > r-pr)
					break;

				if (x+2 <= r && y+1 <= c && step[x+2][y+1] > step[x][y] + 1) {
					xq.add(x+2);
					yq.add(y+1);
					step[x+2][y+1] = step[x][y] + 1;
				}
				if (x-2 > 0 && y+1 <= c && step[x-2][y+1] > step[x][y] + 1) {
					xq.add(x-2);
					yq.add(y+1);
					step[x-2][y+1] = step[x][y] + 1;
				}
				if (x+2 <= r && y-1 > 0 && step[x+2][y-1] > step[x][y] + 1) {
					xq.add(x+2);
					yq.add(y-1);
					step[x+2][y-1] = step[x][y] + 1;
				}
				if (x-2 > 0 && y-1 > 0 && step[x-2][y-1] > step[x][y] + 1) {
					xq.add(x-2);
					yq.add(y-1);
					step[x-2][y-1] = step[x][y] + 1;
				}
				if (x+1 <= r && y+2 <= c && step[x+1][y+2] > step[x][y] + 1) {
					xq.add(x+1);
					yq.add(y+2);
					step[x+1][y+2] = step[x][y] + 1;
				}
				if (x-1 > 0 && y+2 <= c && step[x-1][y+2] > step[x][y] + 1) {
					xq.add(x-1);
					yq.add(y+2);
					step[x-1][y+2] = step[x][y] + 1;
				}
				if (x+1 <= r && y-2 > 0 && step[x+1][y-2] > step[x][y] + 1) {
					xq.add(x+1);
					yq.add(y-2);
					step[x+1][y-2] = step[x][y] + 1;
				}
				if (x-1 > 0 && y-2 > 0 && step[x-1][y-2] > step[x][y] + 1) {
					xq.add(x-1);
					yq.add(y-2);
					step[x-1][y-2] = step[x][y] + 1;
				}

			}
			
//			System.out.println();
//			for (int i=1; i<=r; i++) {
//				for (int j=1; j<=c; j++) {
//					if (i == pr && j == pc)
//						System.out.print((step[i][j] == Integer.MAX_VALUE ? '.':step[i][j]) +"<");
//					else
//						System.out.print((step[i][j] == Integer.MAX_VALUE ? '.':step[i][j]) +" ");
//				}
//				System.out.println();
//			}

			int win = Integer.MAX_VALUE;
			int stalemate = Integer.MAX_VALUE;

			for (int i=pr; i<r; i++) {
				if (step[i][pc] <= i-pr && (i-pr-step[i][pc]) % 2 == 0) {
					win = i-pr + (i-pr-step[i][pc]-1)/2;
					break;
				}
				if (stalemate == Integer.MAX_VALUE && step[i+1][pc] <= i-pr && (i-pr-step[i+1][pc]) % 2 == 0)
					stalemate = i-pr + (i-pr-step[i+1][pc]-1)/2;
			}

			if (win != Integer.MAX_VALUE)
				System.out.println("Win in "+win+" knight move(s).");
			else if (stalemate != Integer.MAX_VALUE)
				System.out.println("Stalemate in "+stalemate+" knight move(s).");
			else
				System.out.println("Loss in "+(r-pr-1)+" knight move(s).");

		}


	}

	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException  e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 

}