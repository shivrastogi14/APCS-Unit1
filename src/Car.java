
public class Car {
private int yearModel;
private String make;
private int speed;

public Car(int yM, String ma) {
	yearModel = yM;
	make = ma;
	speed = 0;
}
public int yeM() {
	return yearModel;
}
public String Model() {
	return make;
}
public int Accelerate() {
	speed+=5;
	return speed;
}
public int Brake() {
	speed-=5;
	return speed;
}
	public static void main(String[] args) {
		Car one = new Car(2019, "Ford Shelby GT500");
		System.out.println("Speed of Car: "+one.Accelerate()+"mph");
		System.out.println("Speed of Car: "+one.Accelerate()+"mph");
		System.out.println("Speed of Car: "+one.Accelerate()+"mph");
		System.out.println("Speed of Car: "+one.Accelerate()+"mph");
		System.out.println("Speed of Car: "+one.Accelerate()+"mph");
		System.out.println("\nSpeed of Car: "+one.Brake()+"mph");
		System.out.println("Speed of Car: "+one.Brake()+"mph");
		System.out.println("Speed of Car: "+one.Brake()+"mph");
		System.out.println("Speed of Car: "+one.Brake()+"mph");
		System.out.println("Speed of Car: "+one.Brake()+"mph");
	}

}
