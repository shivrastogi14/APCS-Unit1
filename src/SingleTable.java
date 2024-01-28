public class SingleTable{
	private int seats;
	private int height;
	private double view;
	
	public SingleTable(int st, int he, double vi) {
		seats = st;
		height = he;
		view = vi;
	}
	
	public int getNumSeats() {
		return seats;
	}
	
	public int getHeight() {
		return height;
	}
	
	public double getViewQuality() {
		return view;
	}
	
	public void setViewQuality(double value) {
		view = value;
	}
}
