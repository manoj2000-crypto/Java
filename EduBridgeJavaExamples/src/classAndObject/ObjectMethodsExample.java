package classAndObject;

public class ObjectMethodsExample implements Cloneable {

	int id;
	String name;
	float per;
	
	public ObjectMethodsExample(int id, String name,float per) 
	{
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public String toString() 
	{
		return "[ id : " + id + " ]\t[ Name : " + name + " ]\t[ per : " + per + " ]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ObjectMethodsExample ome = new ObjectMethodsExample(111, "Manoj", 100);
		System.out.println(ome);
		
		ObjectMethodsExample ome2 = (ObjectMethodsExample ) ome.clone();
		System.out.println(ome2);
	}

}
