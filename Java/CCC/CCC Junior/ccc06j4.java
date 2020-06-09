import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;
public class ccc06j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] B = new boolean[8][8];
		B[1][7] = true;
		B[1][4] = true;
		B[2][1] = true;
		B[3][4] = true;
		B[3][5] = true;
		Scanner sc = new Scanner(System.in);
		int[] A = new int[8];
		A[0]= -1;
		A[1]= 1;
		A[4]= 2;
		A[5]= 1;
		A[7]= 1;

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x==0 && y==0) {
				break;
			}
			A[y]++;
			B[x][y] = true;
		}
		LinkedList<Integer> l = new LinkedList<Integer>();
		while (true) {
			int found = -1;
			for (int i=0; i<8; i++) {
				if (A[i]==0) {
					found = i;
					A[i] = -1;
					l.add(i);
					break;
				}
			}
			if (found==-1) {
				break;
			} else {
				for (int col=0; col<8; col++) {
					if (B[found][col]==true) {
						A[col]--;
					}
				}
			}
		}
		if (l.size()!=7) {
			System.out.println("Cannot complete these tasks. Going to bed.");
		}else{
			for (int m = 0;m<l.size();m++) {
				System.out.print(l.get(m)+" ");
			}
		}
	}
}