//Shiv Rastogi
//NumberPairs
//9/17/20
//A printout of two numbers and their corresponding sums by using mutators, constructors, instances, the toString method and println.


public class NumberPairs {
	// declare the fields / instance variables "num1, num2, and sum"
private double num1; 
private double num2; 
private double sum;
	

	// Code the default constructor
public NumberPairs() {
}
	

	// Code the overloaded constructor that takes two numbers as parameters (not
	// the sum)
public NumberPairs(double nu1, double nu2) {
num1 = nu1;
num2 = nu2;
}

	// Code a mutator to change the values in the NumberPairs object
public void setNums(double n1, double n2) {
num1 = n1;
num2 = n2;
}

	
	// Code a mutator that computes the sum, but does not print it out
public double Sum() {
sum = (num1+num2);
return sum;
}
	// Code a toString method that returns the numbers and their sum
public String toString() {
return num1 + " + " + num2 + " == " + Sum();
}		
	public static void main(String[] args) {
		NumberPairs one = new NumberPairs();
		one.setNums(5, 5);
		NumberPairs two = new NumberPairs(90,100.0);
		NumberPairs three = new NumberPairs(100.5,85.8);
		NumberPairs four = new NumberPairs(-100,55);
		NumberPairs five = new NumberPairs(15236,5642);
		NumberPairs six = new NumberPairs(1000,555);
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println(four.toString());
		System.out.println(five.toString());
		System.out.println(six.toString());
		}
	}


