import java.util.Scanner;

public class dwite09c3p2 {

	static final int [] fib = {0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170};

	static long fibonacci(long a, long b) {
		System.out.print(b+", ");
		if (b > 1000000000) return 1134903170;
		return fibonacci(b, a+b);
	}
	
	 static int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 

	            if (arr[mid] == x || (mid > 0 && (arr[mid] >= x && arr[mid-1] < x))) 
	                return mid; 

	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 

	            return binarySearch(arr, mid + 1, r, x); 
	        } 

	        return -1; 
	    } 


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int t=0; t<5; t++) {
			int n = sc.nextInt();

			// fibonacci(0, 1);	

			int ans = binarySearch(fib, 0, fib.length-1, n);

			if (fib[ans] > n && ans > 0 && fib[ans] - n > n - fib[ans-1])
				System.out.println(fib[ans-1]);
			else
				System.out.println(fib[ans]);
			
		}

	}

}