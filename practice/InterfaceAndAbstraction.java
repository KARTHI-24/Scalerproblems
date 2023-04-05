package practice;

//import java.security.PublicKey;

interface Destination
{
	void right();
	void left();
}

abstract class Animal 
{
	public abstract void animalName() ;
	public abstract void meatFood();
	public void waterConsumption() {
		System.out.println("have to consume 5 litres");
	}
}
abstract class Procedure extends Animal
{
	public void meatFood() {
		System.out.println("chicken,mutton,beef");
	}
	public abstract void animalName();
}
class Procedure1 extends Procedure
{
	public void animalName() {
		System.out.println("tiger");
	}
	} 
class Karthi implements Destination
{
	public void right() 
	{
		System.out.println("In right direction");
    }
   public void left() 
	{
	 System.out.println("In left direction");  
	}
}

public class InterfaceAndAbstraction {

	public static void main(String[] args) {
		Destination objDestination;
		objDestination=new Karthi();
	objDestination.right();
	objDestination.left();
	Animal objAnimal;
	objAnimal=new Procedure1();
	objAnimal.animalName();
	}

}
