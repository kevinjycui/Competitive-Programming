import java.util.*;

public class ccc08j4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String s=sc.nextLine();
            if (s.equals("0")){
                break;
            }
            s=s.replace(" ", "");
            if (s.length()==1){
                System.out.println(s);
            } else {

                Stack <String> a=new Stack<String>();

                for (int i=s.length()-1;i>=0;i--){
                    if (s.charAt(i)=='+'||s.charAt(i)=='-'){
                        String n=a.pop()+" "+a.pop()+" "+s.charAt(i);
                        a.push(n);

                    } else {
                        a.push(s.substring(i,i+1));
                    }

                }

                if (a.size()==1&&a.peek().length()>1){
                    System.out.println(a.peek());
                }

            }

        }

    }

}