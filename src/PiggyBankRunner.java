public class PiggyBankRunner {

	
	
	public static void main(String[] args) {
		PiggyBank one = new PiggyBank(5, 5, 5, 5);
		PiggyBank two = new PiggyBank(2, 3, 4, 1);

		System.out.println("Account 1: " + one + "\n");
		System.out.println("Account 2: " + two + "\n");

//		one.combinePiggy(two);
//		System.out.println("Account 1: " + one + "\n");
//		System.out.println("Account 2: " + two + "\n");
	}

}
