package personpkg;

public class Address {
	private String area;
	private String city;
	private String pincode;
	
	public Address(String a, String c, String p)
	{
		this.area=a;
		this.city=c;
		this.pincode=p;
	}
	
	public void display()
	{
		System.out.println("The address of Customer: "+area+", "+city+", "+pincode);
	}
}
