package classAndObject;

public class TestStudent {

	public static void main(String[] args) {
		//(String name, int age, float marks, int semester,long mobileNumber,String address)
		Student student1 = new Student("Manoj",22,100f,3,7894561230l,"Pune");
		Student student2 = new Student("aaa",32,70f,2,2245561230l,"Mumbai");
		Student student3 = new Student("bbb",42,99f,4,7894512480l,"Nashik");
		Student student4 = new Student("ccc",20,55f,4,7878456230l,"Goa");
		Student student5 = new Student("ddd",21,67f,2,7852149230l,"Pune");
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		student5.display();
	}

}
