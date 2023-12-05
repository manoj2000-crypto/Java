package polymorphism;

class Shape
{
	public void draw() 
	{
		System.out.println("Drawing an unknown shape.");
	}
}

class Circle extends Shape
{
	public void draw() 
	{
		System.out.println("Overriding parent class and Drawing circle.");
	}
}


public class MethodOverridingExample {
	
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.draw();
		
		Shape circle = new Circle();
		circle.draw();
	}

}
