import java.util.Arrays;
import java.util.Scanner;

public class ccc07j5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		
		int [] preset = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
		
		int [] motel = new int [n+preset.length];
		
		for (int i=0; i<preset.length; i++)
			motel[i] = preset[i];

		for (int i=preset.length; i<n+preset.length; i++)
			motel[i] = sc.nextInt();
		
		Arrays.sort(motel);
		
		long [] paths = new long [35];
		paths[0] = 1;
		
		for (int i=0; i<n+preset.length; i++)
			for (int m=i-1; m>=0; m--) {
				if (motel[i] - motel[m] >= a && motel[i] - motel[m] <= b)
					paths[i] += paths[m];
				else if (motel[i] - motel[m] > b)
					break;
			}
		
//		for (int i=0; i<preset.length+n; i++)
//			System.out.print(paths[i]+" ");
//		System.out.println();
		
		System.out.println(paths[preset.length+n-1]);
		
	}

}