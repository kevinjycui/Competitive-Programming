import java.util.Scanner;

public class Main {
    public static void aplusb(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] l = new int [N];
        for (int i=0; i<N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            l[i] = a+b;
        }
        for (int i=0; i<N; i++) {
            System.out.println(l[i]);
        }
    }
}