    import java.util.Scanner;
     
    public class cf1358A {
     
    	public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		int t = sc.nextInt();
    		
    		for (int c=0; c<t; c++) {
    			
    			int n = sc.nextInt();
    			int m = sc.nextInt();
    			
    			if (m%2 == 0)
    				System.out.println((m/2)*n);
    			else if (n%2 == 0) 
    				System.out.println((n/2)*m);
    			else
    				System.out.println((m/2)*n + n/2 + 1);
    			
    		}
    	
    	}
     
    }
