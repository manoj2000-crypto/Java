package designPattern;

interface Animal
{
	int legs = 4;
	String sound = "Silent";
	String eating();
}

class Cow implements Animal
{
	public String eating() 
	{
		return "Veg";
	}
}

class Dog implements Animal
{
	public String eating() 
	{
		return "Both";
	}
}


public class FactoryMethod {

	public static void main(String[] args) {
		
		Cow cow = new Cow();
		System.out.println(cow.legs);
		System.out.println(cow.eating());
		
		Dog dog = new Dog();
		System.out.println(dog.legs);
		System.out.println(dog.eating());
		
	}

}
