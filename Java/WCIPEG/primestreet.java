import java.util.Scanner;

public class primestreet {

	static boolean isPrime(int x) {
		for (int i=2; i<=Math.sqrt(x); i++)
			if (x % i == 0)
				return false;
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int k = sc.nextInt();
		final int T = 100001;

		long [] left = new long [T];
		long [] right = new long [T];

		int li = 0;
		int ri = 0;
		int val = 2;

		while (li < T || ri < T) {
			if (isPrime(val)) {
				if (li < T) {
					left[li] = val;
					li++;
				}
			} else if (ri < T) {
				right[ri] = val;
				ri++;
			}
			val++;
		}

		long min = Long.MAX_VALUE;
		int index = 0;

		for (int i=T-1; i>=0; i--) {
			if (i+1 < T) {
				left[i] += left[i+1];
				right[i] += right[i+1];
			}

			if (i+k < T) {

				long diff = Math.abs((left[i] - left[i+k] - n) - (right[i] - right[i+k]));

				if (min >= diff) {
					min = diff;
					index = i+1;
				}
			}
		}

		System.out.println(index);

	}

}
