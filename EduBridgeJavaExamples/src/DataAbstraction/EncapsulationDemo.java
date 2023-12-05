package DataAbstraction;

public class EncapsulationDemo {

	private int id;
	private long phonenumber;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setId(26);
		ed.setName("Manoj");
		ed.setPhonenumber(9876543245l);
		
		System.out.println(" Id : " + ed.getId());
		System.out.println(" Name : " + ed.getName());
		System.out.println(" Phonenumber : " + ed.getPhonenumber());

	}

}
