package classAndObject;

public class Student {
	
	String name,address;
	int age,semester;
	float marks;
	long mobileNumber;
	static int counter = 0;
	Student(String name, int age, float marks, int semester,long mobileNumber,String address)
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.semester = semester;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	protected void display() 
	{
		counter++;
		System.out.println("\t**Student info " + counter + " : **");
		System.out.println("Student name : " + name);
		System.out.println("Student age : " + age);
		System.out.println("Student marks : " + marks);
		System.out.println("Student semester : " + semester);
		System.out.println("Student Mobile Number : " + mobileNumber);
		System.out.println("Student address : " + address);
		System.out.println();
	}
}
