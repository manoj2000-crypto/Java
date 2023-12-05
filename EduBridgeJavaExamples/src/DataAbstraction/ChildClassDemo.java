package DataAbstraction;

public class ChildClassDemo extends AbstractDemo{

	public static void main(String[] args) {
		
		ChildClassDemo ccd = new ChildClassDemo();
		ccd.write();
		ccd.print();

	}

	@Override
	void print() {
		
		System.out.println("Printing something...");
		
	}

}
