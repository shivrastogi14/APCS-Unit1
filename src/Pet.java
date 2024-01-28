import java.util.Scanner;
public class Pet {
private String name;
private String type;
private int age;

public Pet() {
	
}
public void setName(String na) {
	name = na;
}
public void setType(String tp) {
	type = tp;
}
public void setAge(int ag) {
	age = ag;
}
public String getName() {
	return name;
}
public String getType() {
	return type;
}
public int getAge() {
	return age;
}

	public static void main(String[] args) {
		Pet one = new Pet();
		Scanner key = new Scanner(System.in);
		System.out.println("What is your pet's name? ---> ");
		String nam = key.nextLine();
		System.out.println("What is your pet? ---> ");
		String typ = key.nextLine();
		System.out.println("How old is your pet? ---> ");
		int a = key.nextInt();
		one.setName(nam);
		one.setType(typ);
		one.setAge(a);
		System.out.println("\nName: "+one.getName()+"\nType: "+one.getType()+
		"\nAge: "+one.getAge());
	}

}
