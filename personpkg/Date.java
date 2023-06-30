package personpkg;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	
	public Date()
	{
		dd=dd;
		mm=mm;
		yy=yy;
	}
	public Date(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public void showDate()
	{
		System.out.println("Date: "+dd+"/"+mm+"/"+yy);
	}
}
