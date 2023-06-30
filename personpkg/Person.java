package personpkg;

public class Person {
	private String name;
	private Date dob;
	
	public Person(String name, int dd, int mm, int yy)
	{
		
		this.name=name;
		this.dob=new Date(dd, mm, yy);
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("\n Date of Birth: ");
		dob.showDate();
		
	}
}
