package classAndObject;

public class Test {

	public static void main(String[] args) {
		
//		Student student1 = new Student();
//		student1.calculate();
//		student1.display();
//		
//		Student student2 = new Student(111,"Manju","Manchester",99,98,88);
//		student2.calculate();
//		student2.display();
		
		DefaultEx de = new DefaultEx();
		de.acceptNumber();
		de.add();
		int r = de.sub();
		System.out.println("Sub : " + r);
		
		ParameterizedEx pe = new ParameterizedEx();
		pe.circle(10);
		double res = pe.traingle(7, 12);
		System.out.println("Area of triangle : " + res);
		
		ParameterizedEx.rectangle(3, 6);

	}

}