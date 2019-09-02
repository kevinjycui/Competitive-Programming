import java.util.Arrays;
import java.util.Scanner;

public class ccc07s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] boxes = new int [N][3];
		for (int r=0; r<N; r++) {
			for (int c=0; c<3; c++) {
				boxes[r][c] = sc.nextInt();
			}
			Arrays.sort(boxes[r]);
		}
		
		int M = sc.nextInt();
		for (int i=0; i<M; i++) {
			int min = Integer.MAX_VALUE;
			int[] item = new int[3];
			for (int c=0; c<3; c++) {
				item[c] = sc.nextInt();
			}
			Arrays.sort(item);
			//compare each box
			for (int r=0; r<N; r++) {
				if (item[0]<=boxes[r][0] && item[1]<=boxes[r][1] && item[2]<=boxes[r][2]) {
					int v = boxes[r][0]*boxes[r][1]*boxes[r][2];
					if (min>v) {
						min = v;
					}
				}
			}
			if (min<Integer.MAX_VALUE) {
				System.out.println(min);
			} else {
				System.out.println("Item does not fit.");
			}
		}
		
	}
	

}
