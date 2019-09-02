import java.io.*;
import java.util.*;

public class aminusb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-b);
        }
    }
}