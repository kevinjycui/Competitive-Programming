import java.util.Scanner;
import java.util.LinkedList;
public class ccc10j5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] Step = new int[9][9];
		int bx = scan.nextInt();
		int by = scan.nextInt();
		for(int i = 0; i < 9; i++){
			//Arrays.fill(Step[i], 100);
			for(int j = 0; j < 9; j++){
				Step[i][j] = 100;
			}
		}
		Step[bx][by] = 0;
		LinkedList<Integer> xList = new LinkedList<Integer>();
		LinkedList<Integer> yList = new LinkedList<Integer>();
		xList.add(bx);
		yList.add(by);
		while(!xList.isEmpty()){
			int x = xList.poll();
			int y = yList.poll();
			if(x+1<=8&& y+2<=8 && Step[x+1][y+2]>Step[x][y]+1){
				xList.add(x+1);
				yList.add(y+2);
				Step[x+1][y+2] = Step [x][y] + 1;
			}
			if(x+2<=8&& y+1<=8 && Step[x+2][y+1]>Step[x][y]+1){
				xList.add(x+2);
				yList.add(y+1);
				Step[x+2][y+1] = Step [x][y] + 1;
			}
			if(x+2<=8&& y-1>0 && Step[x+2][y-1]>Step[x][y]+1){
				xList.add(x+2);
				yList.add(y-1);
				Step[x+2][y-1] = Step [x][y] + 1;
			}
			if(x+1<=8&& y-2>0 && Step[x+1][y-2]>Step[x][y]+1){
				xList.add(x+1);
				yList.add(y-2);
				Step[x+1][y-2] = Step [x][y] + 1;
			}
			if(x-1>0&& y-2>0 && Step[x-1][y-2]>Step[x][y]+1){
				xList.add(x-1);
				yList.add(y-2);
				Step[x-1][y-2] = Step [x][y] + 1;
			}
			if(x-2>0&& y-1>0 && Step[x-2][y-1]>Step[x][y]+1){
				xList.add(x-2);
				yList.add(y-1);
				Step[x-2][y-1] = Step [x][y] + 1;
			}
			if(x-2>0&& y+1<=8 && Step[x-2][y+1]>Step[x][y]+1){
				xList.add(x-2);
				yList.add(y+1);
				Step[x-2][y+1] = Step [x][y] + 1;
			}
			if(x-1>0&& y+2<=8 && Step[x-1][y+2]>Step[x][y]+1){
				xList.add(x-1);
				yList.add(y+2);
				Step[x-1][y+2] = Step [x][y] + 1;
			}
		}
		System.out.println(Step[scan.nextInt()][scan.nextInt()]);
	}

}