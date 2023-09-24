import java.util.Scanner;

public class AreaUsingSwitch {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print(" 'Circle', 'Triangle', 'Rectangle'\n Enter Your Choice :  ");
				String choice = sc.next();
				
				switch(choice)
				{
				case "Circle" : 
					System.out.println("Circle : ");
					System.out.print("Enter Radius : ");
					float r = sc.nextFloat();
					float area = (3.14f*(r*r));
					System.out.println("Area of circle : " + area);
					break;
					
				case "Triangle":
					System.out.println("Triangle : ");
					System.out.print("Enter base and height : ");
					float b = sc.nextFloat();
					float h = sc.nextFloat();
					area = (0.5f*b*h);
					System.out.println("Area of Triangle : " + area);
					break;
				
				case "Rectangle":
					System.out.println("Rectangle : ");
					System.out.print("Enter Length and width : ");
					float l = sc.nextFloat();
					float w = sc.nextFloat();
					area = (l*w);
					System.out.println("Area of Rectangle : " + area);
					break;
				
				default : System.out.println("Please type any one from choices.");
				}
				sc.close();
	}

}
