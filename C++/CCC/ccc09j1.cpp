import java.io.*;
import java.util.*;

public class wc164s31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String s = "9780921418"+a+b+c;
        int count = 0;
        for (int i=0; i<s.length(); i++){
            count += Integer.parseInt(Character.toString(s.charAt(i)))*((i%2)*2+1);
        }
        System.out.println("The 1-3-sum is "+count);
    }
}