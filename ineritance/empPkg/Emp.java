package empPkg;

public class Emp extends Person{
	private String empid;
	private double salary;
	
	public Emp(String name, int dd, int mm, int yy, String empid, double salary)
	{
		super(name, dd, mm, yy);
		this.empid=empid;
		this.salary=salary;
		
	}

	
	public void display()
	{
		super.display();
		System.out.println("Empid: "+empid+"\n Salary: "+salary);
	}
	
}
