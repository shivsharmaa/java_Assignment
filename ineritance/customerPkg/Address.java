package customerPkg;

public class Address {
	private String city;
	private String area;
	private String pincode;
	
	// default constructor
	public Address()
	{
		
	}
	
// Parametrized constructor
	
	public Address(String city, String area, String pincode)
	{
		this.city=city;
		this.area=area;
		this.pincode=pincode;
	}
	
// Dispay method to print the value
	public void display()
	{
		System.out.println("City: "+city);
		System.out.println("Area: "+area);
		System.out.println("Pincode: "+pincode);
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + ", pincode=" + pincode + "]";
	}
	
	
}
