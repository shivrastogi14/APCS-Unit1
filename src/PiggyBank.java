public class PiggyBank {
private double pennies;
private double nickels;
private double dimes;
private double quarters;

public PiggyBank() {
	
}
public PiggyBank(double pen, double nick, double dim, double qua) {
	pennies = pen;
	nickels = nick;
	dimes = dim;
	quarters = qua;
}
public String Coind() {
	return pennies+" pennies, "+nickels+" nickels, "+dimes+
			" dimes, "+quarters+" quarters";
}
public double Sum() {
	return (pennies/100.00)+(nickels/100.00*5.0)+(dimes/100.00*10.0)+(quarters/100.00*25.0); 
}
public String toString() {
	return String.format("The amount of coins you have is %s and the total sum is %.2f dollars.",Coind(),Sum());
}
}
