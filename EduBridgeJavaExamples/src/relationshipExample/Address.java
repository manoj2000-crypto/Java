package relationshipExample;

public class Address {
	
	protected String addrLine, street, city, state, country, pincode;//instance variables.
	
	public Address() 
	{
		addrLine = "222 Suvarnatara Building";
		street = "Mumbai-pune highway";
		city = "Pune";
		state = "Maharashtra";
		country = "India";
		pincode = "411011";
	}
	
	public Address(String addrLine,String street,String city,String state,String country,String pincode) 
	{
		this.addrLine = addrLine ;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	public void display() 
	{
		System.out.println("Address : " + addrLine + ", " + street + ", " + city + ", " + state + ", " + country + ", " + pincode);
	}

}
