import java.io.*;
import java.util.*;

public class bf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean exit = false;
        while (!exit){
            double k = Math.sqrt(n);
            exit = true;
            for (int i=2; i<=k; i++) {
                if (n%i==0) {
                    exit = false;
                }
            }
            n++;
        }
        if (n==2){
            System.out.println(2);
        } else {
            System.out.println(n-1);
        }
    }
}