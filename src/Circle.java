public class Circle {
private double radius;
private double area;
private double diameter;
private double circ;
	
public Circle() {
	
}

public Circle(double radi) {
		radius = radi;
	}
public void changeRadius(double radiu) {
	radius = radiu;
}
	public double compArea() {
		area = Math.PI*(Math.pow(radius, 2));
		return area;
	}
	public double compDiameter() {
		diameter = radius*2;
		return diameter;
	}
	public double compCircum() {
		circ = 2*(Math.PI*radius);
		return circ;
	}
	public String toString() {
		 return String.format("Circle\nradius: %.1f units\n"+
	"area: %.4f square units\ndiameter: %.1f units\n"+
				 "circumference: %.5f units", radius,compArea(),
				 compDiameter(),compCircum());
	}
		 public String toString2() {
			 return String.format("Circle\nradius: %.1f units\n"+
		"area: %.8f square units\ndiameter: %.1f units\n"+
					 "circumference: %.7f units", radius,compArea(),
					 compDiameter(),compCircum());
		 }
			 public String toString3() {
				 return String.format("Circle\nradius: %.1f units\n"+
			"area: %.2f square units\ndiameter: %.1f units\n"+
						 "circumference: %.4f units", radius,compArea(),
						 compDiameter(),compCircum());
	}
}
