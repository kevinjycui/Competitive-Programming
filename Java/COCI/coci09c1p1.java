import java.util.Scanner;
import java.util.Arrays;
public class coci091p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []b = new int[9];
		for (int i=0;i<8;i++) {
			b[i] = sc.nextInt();
		}
		if (b[0]>b[1] && b[1]>b[2] && b[2]>b[3] && b[3]>b[4] && b[4]>b[5] && b[5]>b[6] && b[6]>b[7]) {
				System.out.println("descending");
			}
			else if (b[0]<b[1] && b[1]<b[2] && b[2]<b[3] && b[3]<b[4] && b[4]<b[5] && b[5]<b[6] && b[6]<b[7]) {
				System.out.println("ascending");
			} else {
				 System.out.println("mixed");
			}

	}
}