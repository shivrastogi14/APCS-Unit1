import java.util.Random;
public class GameSpinner {
private int rnum = 0;
private int runs = 0;
private int num = 0;
private int pnum = 0;
Random rand = new Random();

public GameSpinner(int num) {
	rnum = num;
}

public void currentRun() {
	System.out.println(runs);
}

public void Spin() {
	pnum = num;
	num = rand.nextInt(rnum)+1;
	if(pnum == num) {
		runs++;
	}
	else {
		runs = 1;
	}
	System.out.println(num);
}

public static void main(String[]args) {
	GameSpinner g = new GameSpinner(4);
	g.currentRun();
	g.Spin();
	g.currentRun();
	g.Spin();
	g.currentRun();
	g.Spin();
	g.currentRun();
	g.Spin();
	g.currentRun();
	g.Spin();
	g.currentRun();
	g.Spin();
	g.currentRun();
}
}
