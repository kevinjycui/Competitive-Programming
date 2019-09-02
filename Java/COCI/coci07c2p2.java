import java.util.Scanner;
public class coci07c2p2 {
	//incomplete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int H = a/2;
		int V = a/2;
			if (a%2!=0) {
				V++;
			}
		
		System.out.println((H+1)*(V+1));


	}
}