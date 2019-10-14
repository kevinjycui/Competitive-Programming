package dmopc2019october;

import java.util.Arrays;
import java.util.Scanner;

public class dmopc19c2p0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int hmin = sc.nextInt();
		int hmax = sc.nextInt();
		
		int [] h = new int [n];
		
		for (int i=0; i<n; i++) {
			h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
		
		int a = search(h, hmax, true);
		int b = search(h, hmin, false);
		
		System.out.println(a-b+1);
		
	}
	
	public static int search(int [] arr, int val, boolean less) {
		for (int i=0; i<arr.length; i++) {
			if (less && arr[i] <= val && (i == arr.length - 1 || arr[i+1] > val)) {
				return i;
			} 
			else if (!less && arr[i] >= val && (i == 0 || arr[i-1] < val)) {
				return i;
			}
		}
		return -1;
	}

}
