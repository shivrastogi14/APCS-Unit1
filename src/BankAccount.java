
public class BankAccount {
	/**
	 * A bank account has a balance that can be changed by deposits and
	 * withdrawals.
	 */
	private String acctNumb;
	private double balance;

	/**
	 *Make a no arguments Bank Account Constructor
	 */
	public BankAccount() {
		
	}

	/**
	 * Make 2 bank account constructors which include 2 parameters
	 * 
	 * 
	 * @param anacctNumb
	 *            the account number for this account
	 * 
	 * @param initialBalance
	 *            the initial balance
	 */
	public BankAccount(String acNu, double bal) {
		acctNumb = acNu;
		balance = bal;
	}
	public BankAccount(double bala, String aNum) {
		acctNumb = aNum;
		balance = bala;
	}

	
	/**
	 * Make a getter and setter for each instance variable
	 */
	public void Account(String act) {
		acctNumb = act;
	}
	public String Account() {
		return acctNumb;
	}
	public void Balance(double ba) {
		balance = ba;
	}
	public double Balance() {
		return balance;
	}
	
	/**
	 * Override the toString method in order to output the data for an object
	 * 
	 * 
	 * @return description of Account
	 */
	public String toString() {
		return "Bank Account# = "+acctNumb;
	}

	/**
	 * Deposits money into the bank account.
	 * 
	 * 
	 * @param amount
	 *            the amount to deposit
	 */
	
	
	
	/**
	 * Withdraws money from the bank account.
	 * 
	 * 
	 * @param amount
	 *            the amount to withdraw
	 */
	
	
	/**
	 * Writes the account number of the current account followed by the number 
	 * of an account provided by a parameter
	 * 
	 * 
	 * @param b
	 *         a BankAccount object
	 */
	
	
	/**
	 * Calculate the monthly interest that the account gains
	 * Equation= balance*rate/12/100
	 * 
	 * @param rate
	 *         rate being applied to the account formatted as 0.0
	 */
	

	// USE THIS AS YOUR MAIN METHOD
	public static void main(String[] args) {
		
//		BankAccount one = new BankAccount(1000, "12345");
//		System.out.println(one.toString());
				
//		one.deposit(200);
//		System.out.println(one);
//		one.withdraw(25);
//		System.out.println(one);
//		System.out.println();
//		
//		BankAccount two = new BankAccount(90, "333");
//		System.out.println(two.toString());
//		two.deposit(20);
//		two.twoAccounts(one);
		
//		System.out.println(two);
//		System.out.println();
//
//		BankAccount three = new BankAccount(1000, "111111");
//		three.calcMonthlyInterest(2.0);
//		System.out.println(three.getBalance());

	}
}
