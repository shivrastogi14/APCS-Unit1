import java.util.Scanner;

public class CircleRunnerScanner {

	public static void main(String[] args) {

		Circle one = new Circle();
		one.changeRadius(10);
		System.out.println(one.toString());
		System.out.println();

		Circle two = new Circle(11.9);
		System.out.println(two.toString2());
		System.out.println();

		Scanner key = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = key.nextDouble();
		Circle three = new Circle(r);
		System.out.println(three.toString3());
		System.exit(0);
	}

}
