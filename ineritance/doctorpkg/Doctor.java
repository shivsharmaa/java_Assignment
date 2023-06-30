package doctorpkg;

public class Doctor extends Person{
	private String degree;
	private String reg_no;
	private double salary;
	
	
	public Doctor(String name, int dd, int mm, int yy, 
			String deg, String rno, double sal)
	{
		super(name, dd, mm, yy);
		this.degree=deg;
		this.reg_no=rno;
		this.salary=sal;
	}


	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", reg_no=" + reg_no + ", salary=" + salary + ", toString()="
				+ super.toString() + "]";
	}


	
	
	
	
}
