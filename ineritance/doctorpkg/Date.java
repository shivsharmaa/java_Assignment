package doctorpkg;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date(int d, int m, int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}

	public void showDate()
	{
		System.out.println("Date: " + dd + " / " + mm + " / " + yy);
	}
	
}
