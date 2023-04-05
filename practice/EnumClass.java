package practice;

//import javax.management.loading.PrivateClassLoader;
//import javax.swing.event.TableColumnModelListener;

enum Laptop
{
	Mackbook(2000),
	Thinkpad(1800),
	DellLaptop(1600),
	Asus(1700);
	
	private int price;
	Laptop(int i) {
		price =i;
     
	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}

	
}
public class EnumClass {

	public static void main(String[] args) {
		Laptop laptop=Laptop.DellLaptop;
		System.out.println(laptop+":"+laptop.getPrice());
		System.out.println(laptop.ordinal());
		
		for (Laptop laptop1 : Laptop.values()) {
			System.out.println(laptop1+":"+laptop1.getPrice());
		}

	}

}
