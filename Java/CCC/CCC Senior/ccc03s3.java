import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ccc03s3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		boolean [][] visited = new boolean [r][c];
		
		for (int i=0; i<r; i++) {
			String s = sc.next();
			for (int j=0; j<c; j++) {
				if (s.charAt(j) == 'I') visited[i][j] = true;
			}
		}
		
		int rooms = 0;
		int [] areas = new int [700];
		Arrays.fill(areas, Integer.MAX_VALUE);
		
		LinkedList<Integer> xq = new LinkedList<Integer>();
		LinkedList<Integer> yq = new LinkedList<Integer>();
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				if (!visited[i][j]) {
					
					rooms++;
					areas[rooms-1] = 0;

					visited[i][j] = true;

					xq.add(i);
					yq.add(j);
										
					while (!xq.isEmpty()) {
						int x = xq.pop();
						int y = yq.pop();
												
						areas[rooms-1]++;
						
						if (x+1<r && !visited[x+1][y]) {
							xq.add(x+1);
							yq.add(y);
							visited[x+1][y] = true;
						}
						if (x-1>=0 && !visited[x-1][y]) {
							xq.add(x-1);
							yq.add(y);
							visited[x-1][y] = true;
						}
						if (y+1<c && !visited[x][y+1]) {
							xq.add(x);
							yq.add(y+1);
							visited[x][y+1] = true;
						}
						if (y-1>=0 && !visited[x][y-1]) {
							xq.add(x);
							yq.add(y-1);
							visited[x][y-1] = true;
						}
					}
				}
			}
		}
		
		Arrays.sort(areas);
		
		int count = 0;
		int sum = 0;
		
		for (int i=rooms-1; i>=0; i--) {
			if (sum + areas[i] <= k) {
				sum += areas[i];
				count++;
			} else {
				break;
			}
		}
						
		if (count == 1)
			System.out.println("1 room, "+Math.max(k-sum, 0)+" square metre(s) left over");
		else
			System.out.println(count+" rooms, "+Math.max(k-sum, 0)+" square metre(s) left over");
				
	}

}