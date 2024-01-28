public class CombinedTable {
	private SingleTable[] ct = new SingleTable[2];
	
	public CombinedTable(SingleTable tb1, SingleTable tb2) {
		ct[0] = new SingleTable(tb1.getNumSeats(), tb1.getHeight(), tb1.getViewQuality());
		ct[1] = new SingleTable(tb2.getNumSeats(), tb2.getHeight(), tb2.getViewQuality());
	}
	
	
	public void canSeat(int num) {
		if((ct[0].getNumSeats()+ct[1].getNumSeats())-2>=num) {
			System.out.println(true);
}
		else
		System.out.println(false);
	}
	
	public void getDesirability() {
		double avg = 0;
		if(ct[0].getHeight()==ct[1].getHeight()) {
			avg = (ct[0].getViewQuality()+ct[1].getViewQuality())/2.0;
		}
		else {
			avg =  (ct[0].getViewQuality()+ct[1].getViewQuality())/2.0-10.0;
		}
		System.out.println(avg);
	}
	
	public static void main(String[]args) {
		SingleTable one = new SingleTable(4,74, 60.0);
		SingleTable two = new SingleTable(8, 74, 70.0);
		SingleTable three = new SingleTable(12,76,75.0);
		CombinedTable c1 = new CombinedTable(one, two);
		c1.canSeat(9);
		c1.canSeat(11);
		c1.getDesirability();
		CombinedTable c2 = new CombinedTable(two,three);
		c2.canSeat(18);
		c2.getDesirability();
		two.setViewQuality(80);
		c2.getDesirability();
	}
}
