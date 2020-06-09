import java.util.Scanner;

public class ccc10j4 {

    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n==0) {
                break;
            }
            if(n == 1){
                n = sc.nextInt();
                System.out.println(0);
                continue;
            }
            int[] orig = new int[n];
            for (int i=0; i<n; i++) {
                orig[i] = sc.nextInt();
            }
            int[] diff = new int[n-1];
            for (int i=0; i<n-1; i++) {
                diff[i] = orig[i+1] - orig[i];
            }

            for (int l=1; l<=n; l++) { 
                boolean flag = true;
                for (int i=0; i<n-1-l; i++) {
                    if (diff[i]!=diff[i+l]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(l);
                    break;
                }
            }
        
        }

    }

}