package customerPkg;

public class RegCustomer extends Customer {
	private int reg_no;

	
	// parameter Constructor 
	
	public RegCustomer(String emailid, String city, 
			String area, String pincode, int reg_no)
	{
		super(emailid, city, area, pincode);
		this.reg_no=reg_no;
		
	}
	
	public void giveDiscount(double price)
	{
		
		double dis=price+((price*5)/100);
		System.out.println(dis);
	}

	@Override
	public String toString() {
		return "RegCustomer [reg_no=" + reg_no + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
