package personpkg;

public class Customer {
	private String emailid;
	private Address add;
	
	
	public Customer(String email, String a, String c, String p)
	{
		this.emailid=email;
		this.add=new Address(a, c, p);
	}
	
	public void display()
	{
		System.out.println("The emaildid is: "+emailid);
		add.display();
	}
}
