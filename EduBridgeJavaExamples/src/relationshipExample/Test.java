package relationshipExample;

public class Test {

	public static void main(String[] args) {
		
		Address address = new Address("5 Suvarnatara building ", "Ganga nagar ","Pune ","Maharashtra ","India ","411027");
		Grades g = new Grades(111,"Manoj",97,95,99);
		g.calculate();
		g.display();
		address.display();
		
		Address address2 = new Address("207 Skyna Cystal building ", "Andheri ","Mumbai ","Maharashtra ","India ","511024");
		Grades g2 = new Grades(112,"Gulab Kumar",35,54,67);
		g2.calculate();
		g2.display();
		address2.display();
	}

}
