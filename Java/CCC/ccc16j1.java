import java.util.Scanner;

public class ccc16j1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int count = 0;
		for (int i=0; i<6; i++) {
			char c = sc.next().charAt(0);
			if (c=='W') {
				count++;
			}
		}
		if (count==5 || count==6) {
			System.out.println(1);
		} else if (count==4 || count ==3) {
			System.out.println(2);
		} else if (count==2 || count==1) {
			System.out.println(3);
		} else if (count==0){
			System.out.println(-1);
		}

	}

}