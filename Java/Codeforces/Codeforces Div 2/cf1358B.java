import java.util.Arrays;
import java.util.Scanner;

public class cf1358B {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int c=0; c<t; c++) {
            
            int n = sc.nextInt();
            
            int [] a = new int[100001];
            
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a, 0, n);
            
            int k = 0;
            int m = 0;
            
            for (int i=0; i<n; i++) {
                m = Math.max(m, a[i]);
                if (m <= i + 1) k = i + 1;
            }
            
            System.out.println(k + 1);
            
        }

    }

}
