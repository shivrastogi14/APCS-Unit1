public class RetailItem {
private String description;
private int unitsOH;
private double price;

public RetailItem() {
	
}
public void Description(String des) {
	description = des;
}
public void unitsOH(int UOH) {
	unitsOH = UOH;
}
public void Price(double pr) {
	price = pr;
}
public String Description() {
	return description;
}
public int unitsOH() {
	return unitsOH;
}
public double Price() {
	return price;
}

	public static void main(String[] args) {
		RetailItem one = new RetailItem();
		RetailItem two = new RetailItem();
		RetailItem three = new RetailItem();
		one.Description("Jacket");
		one.unitsOH(12);
		one.Price(59.95);
		two.Description("Designer Jeans");
		two.unitsOH(40);
		two.Price(34.95);
		three.Description("Shirt");
		three.unitsOH(20);
		three.Price(24.95);
		System.out.println("\t\tDescription   Units On Hand\tPrice\n\nItem #1\t\t"+
				one.Description()+"\t\t"+one.unitsOH()+"\t\t"+one.Price());
		System.out.println("\n\n\t\tDescription   Units On Hand\tPrice\n\nItem #2\t\t"+
				two.Description()+"\t"+two.unitsOH()+"\t\t"+two.Price());
		System.out.println("\n\n\t\tDescription   Units On Hand\tPrice\n\nItem #3\t\t"+
				three.Description()+"\t\t"+three.unitsOH()+"\t\t"+three.Price());
	}
}
