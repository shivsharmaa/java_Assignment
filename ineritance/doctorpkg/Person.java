package doctorpkg;

public class Person {
	private String name;
	private Date dob;
	
	public Person(String name, int dd, int mm, int yy)
	{
		
		this.setName(name);
		this.dob=new Date(dd, mm, yy);
	}

	public void display()
	{
		System.out.println("Name: "+getName());
		if(dob!=null)
			dob.showDate();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


