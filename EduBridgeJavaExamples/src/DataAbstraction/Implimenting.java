package DataAbstraction;

public class Implimenting implements InterfaceDemo {
	
	@Override
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}

	@Override
	public void print() {
		System.out.println("Printing something...");
	}
	
	public static void main(String[] args) {
		
		Implimenting imple = new Implimenting();
		imple.add(12,23);
		imple.print();

	}

	

}
