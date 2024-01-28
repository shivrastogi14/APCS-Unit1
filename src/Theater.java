public class Theater {
private Seat[][] theaterSeats;
public Theater(int seatsPerRow, int tier1Rows, int tier2Rows) {
	theaterSeats = new Seat[(tier1Rows+tier2Rows)][seatsPerRow];
}

public boolean reassignSeat(int fromRow, int fromCol, int toRow, int toCol) {
	if(theaterSeats[fromRow][fromCol].getTier()<=theaterSeats[toRow][toCol].getTier()){
		if(theaterSeats[toRow][toCol].isAvailable() == true){
			theaterSeats[fromRow][fromCol].setAvailability(true);
			theaterSeats[toRow][toCol].setAvailability(false);
			return true;
			}
		}
	return false;
}

public static void main(String[]args) {
	Theater one = new Theater(10, 2, 2);
	System.out.println(one.reassignSeat(1, 1, 0, 1));
}
}
