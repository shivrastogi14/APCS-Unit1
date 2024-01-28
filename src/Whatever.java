import java.util.Scanner;
public class Whatever {
	public static void magicsquares(int x) {
		int row = x-1;
		int col = x-2;
		int[][]ms = new int[row][col];
		ms[0][x/2] = x;
		for(int num = 1; num<=x*x; num++) {
			if(row<0) {
				row = x-1;
			}
			if(col>x-1) {
				col = 0;
			}
			ms[row][col] = num;
}
	}

	public static void main(String[]args) {
	}
}
