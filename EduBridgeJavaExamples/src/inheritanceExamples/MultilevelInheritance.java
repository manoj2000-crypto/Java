package inheritanceExamples;
/*
 * Class School: void fun() //Grandparent classclass Teacher: void teach()  
 * // Parent classclass Student: void learn()  // child class
 * */

class School //Grand parent class
{
	void fun() 
	{
		System.out.println("School class : fun()");
	}
}
class Teacher extends School //Child class is inheriting parent class.
{
	void teach() 
	{
		System.out.println("Teacher class : teach()");
	}
}
class Student extends Teacher // child class is inheriting prent properties as well as grandparent properties also.
{
	void learn() 
	{
		System.out.println("Student class : learn()");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.fun();
		stu.teach();
		stu.learn();

	}

}
