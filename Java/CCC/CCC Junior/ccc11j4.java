import java.util.Scanner;

public class ccc11j4 {

    public static void main(String[] args) {
    // TODO Auto-generated method stub

        boolean[][] grid = new boolean[201][401];
        grid[1][200] = true;
        grid[2][200] = true;
        grid[3][200] = true;
        grid[3][201] = true;
        grid[3][202] = true;
        grid[3][203] = true;
        grid[4][203] = true;
        grid[5][203] = true;
        grid[5][204] = true;
        grid[5][205] = true;
        grid[4][205] = true;
        grid[3][205] = true;
        grid[3][206] = true;
        grid[3][207] = true;
        grid[4][207] = true;
        grid[5][207] = true;
        grid[6][207] = true;
        for (int col=199; col<=207; col++) {
        grid[7][col] = true;
        }
        grid[5][199] = true;
        grid[6][199] = true;

        int curRow = 5;
        int curCol = 199;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.next();
            int n = sc.nextInt();
            boolean flag = false;
            if (S.equals("q")) {
            break;	
            //l decrease col by 1
            //r increase col by 1
            //u decrease row by 1
            //d increase row by 1
            } else if (S.equals("l")) {
                for (int i=0;i<n; i++) {
                    curCol--;
                    if (grid[curRow][curCol] == true) {
                        flag = true;
                    }
                    grid[curRow][curCol] = true;
                }
                } else if (S.equals("r")) {
                    for (int i=0;i<n; i++) {
                        curCol++;
                    if (grid[curRow][curCol] == true) {
                        flag = true;
                    }
                        grid[curRow][curCol] = true;
                    }
                } else if (S.equals("d")) {
                    for (int i=0;i<n; i++) {
                        curRow++;
                    if (grid[curRow][curCol] == true) {
                        flag = true;
                    }
                        grid[curRow][curCol] = true;
                    }
                } else if (S.equals("u")) {
                    for (int i=0;i<n; i++) {
                        curRow--;
                    if (grid[curRow][curCol] == true) {
                        flag = true;
                    }
                        grid[curRow][curCol] = true;
                }
            }

            if (flag) {
                System.out.println(curCol-200+" "+(-curRow)+" DANGER");
                break;
            } else {
                System.out.println(curCol-200+" "+(-curRow)+" safe");
            }
        }


    }
}