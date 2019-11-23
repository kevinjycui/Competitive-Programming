import java.util.Scanner;

public class tc19summerj3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i=0; i<a; i++)
        	b[i] = sc.nextInt();
        
        String s ="";
        for(int i=0; i<a-1; i++)
        	s += (char) ((b[i]*b[i+1]) % 26 + 65);
        
        System.out.println("Thanos is on Planet: " +s);
        
    }
    
}