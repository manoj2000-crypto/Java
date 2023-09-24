package MethodExamples;

//create Area class and calculate area of circle, rectangle, triangle, and square and cube.

import java.util.Scanner;

public class Area {

	public void areaOfCircle(float radius) 
	{
		System.out.println("Area of circle : " + ( 3.14f*radius*radius ) );
	}
	private int areaOfRectangle(int length, int breadth)
	{
		return ( length * breadth );
	}
	public long square(long n1)
	{
		return ( n1 * n1 );
	}
	protected static void triangle(int base, int height) 
	{
		System.out.println("Area of Triangle : " + ( 0.5 * base * height ));
	}
	
	static 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to get it's cube : ");
		int cube = sc.nextInt();
		System.out.println("Cube of " + cube + " number : " + (cube*cube*cube) );		
		sc.close();
	}
	
	public static void main(String[] args) {
		
		Area.triangle( 10, 5 ); // Static method
		
		Area area = new Area();
		
		area.areaOfCircle( 10 );
		
		System.out.println("Area of Rectangle : " + area.areaOfRectangle( 20, 5 ) );
		System.out.println("Square of the given number : " + area.square( 9 ) );
		
	}

}
