import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ucc2020p5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int s = sc.nextInt();
		int e = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> map [] = new ArrayList[1005];
		
		for (int i=1; i<=l; i++)
			map[i] = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a].add(b);
		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int [] steps = new int [1005];
		Arrays.fill(steps, 1 << 30);
		
		queue.add(s);
		steps[s] = 0;
		
		while (!queue.isEmpty()) {
			
			int p = queue.pop();
			
			for (int i=0; i<map[p].size(); i++)
				if (steps[map[p].get(i)] > steps[p] + 1) {
					steps[map[p].get(i)] = steps[p] + 1;
					queue.add(map[p].get(i));
				}
			
		}
		
		System.out.println(steps[e]%1000);
		
	}

}
