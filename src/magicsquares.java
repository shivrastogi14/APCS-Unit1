import java.util.Scanner;
public class magicsquares {
//Method that creates the magic squares:
	public static void magicSquare(int x) {
		 int[][] ms = new int[x][x];
		 ms[0][x/2] = x;
		 int a = x / 2;
		 int b = x - 1;
		 for (int num = 1; num <= x * x;) {
			 System.out.println("b: "+b);
			 if (a == -1){
				 a = 0;
			 }
			 else if(b == x) {
				 b = x - 2;
			 }
			 else {
				 if (b == x)
					 b = 0;
				 if (a < 0)
					 a = x - 1;
			 }
			 if (ms[a][b] != 0) {
				 b -= 2;
				 a++;
				 continue;
			 		}
			 else 
				 ms[a][b] = num++;
			 		b++;
			 		a--;
	}

			//Method to print out the magic square//
			System.out.println("The Magic Square for " + x + ":");
			System.out.println("Sum of each row or column =  "+ x * (x * x + 1) / 2);
			for (a = 0; a < x; a++) {
				for (b = 0; b < x; b++)
					System.out.print(ms[a][b] + " ");
				System.out.println();
			}
			}

	//Main Method:
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Scanner msOrder	= new Scanner(System.in);
			Scanner msinterval	= new Scanner(System.in);
			System.out.print("Enter an odd number between 3-15: ");
			String x = input.nextLine();
	
			while(x!= "n" || x!= "N") 
			{
			System.out.println(x);

			int x_int = Integer.parseInt(x);
				magicSquare(x_int);
				Scanner input_in = new Scanner(System.in);
				System.out.println();
				System.out.print("Enter an odd number between 3-15: ");
				x = input.nextLine();
			}
			}
}
			
