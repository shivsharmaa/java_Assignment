package customerPkg;
public class Customer {
	private String emailid;
	private Address add;
	
	// default constructor
	public Customer()
	{
		
	}

// Parametrized constructor
	public Customer(String email, String city, String area, String pincode)
	{
		this.emailid=email;
		this.add=new Address(city, area, pincode);
	}

	 public void giveDiscount(double price)
	 {
		 double dis=price;
		 System.out.println(dis); 
	 }

	@Override
	public String toString() {
		return "Customer [emailid=" + emailid + ", add=" + add + "]";
	}

	 
	 
	 
}
