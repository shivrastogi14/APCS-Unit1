
public class Schedule {
String name;
String subject;
	
 public Schedule(String na, String sub) {
 name = na;
 subject = sub;
 }
public String List() {
	String sentence = name + "\t\t" + subject;
	return sentence;
}

public static void main(String[] args) {

	Schedule Pd1 = new Schedule("Sheller, Dara", "Language Arts III Honors");
	Schedule Pd2 = new Schedule("Vostal Kelly", "AP Computer Science Principles");
	Schedule Pd3 = new Schedule("Jaworsky, Cynthia", "AP Chemistry");
	Schedule Pd4 = new Schedule("Study Hall","Science Study Hall");
	Schedule Pd5 = new Schedule("Kelley, Jennifer", "Spanish 5");
	Schedule Pd6 = new Schedule("Collura, Peter", "Pre-calculus");
	Schedule Pd7 = new Schedule("McCann, Brendan", "AP Computer Science A");
	Schedule Pd8 = new Schedule("Hayden, Lisa", "Physical Education/Health");
	
    System.out.println(Pd1.List()+"\n"+Pd2.List()+"\n"+Pd3.List()+"\n"+Pd4.List()+		"\n"+Pd5.List()+"\n"+Pd6.List()+"\n"+Pd7.List()+"\n"+Pd8.List());
	
	
	}
}

