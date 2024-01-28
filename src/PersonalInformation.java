public class PersonalInformation {
private String name;
private String address;
private int age;
private String phon;

public PersonalInformation(){
	
}
public PersonalInformation(String nam, String ad, int ae, String pho) {
	name = nam;
	address = ad;
	age = ae;
	phon = pho;
}
public void Name(String na) {
	name = na;
}
public void Address(String add) {
	address = add;
}
public void Age(int ag) {
	age = ag;
}
public void Phone(String ph) {
	phon = ph;
}
public String Name() {
	return name;
}
public String Address() {
	return address;
}
public int Age() {
	return age;
}
public String Phone() {
	return phon;
}
public String toString() {
	return "Name: "+Name()+"\nAddress: "+Address()+"\nAge: "+Age()+"\nPhone#: "+Phone()+"\n";
}
public static void main (String[]args) {
	PersonalInformation one = new PersonalInformation("Shiv Rastogi", "2 Cambridge Way", 16, "609-375-7847");
	PersonalInformation two = new PersonalInformation("Max Well", "5 OD Lane", 17, "609-513-2847");
	PersonalInformation three = new PersonalInformation("Andrew Brown", "5 Ashland Street", 16, "609-235-7747");
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
}
}
