package accountpkg;

public class Account {
	private String accno;
	private double bal;
	static float int_rate;
	static
	{
		System.out.println("In Static Block");
		int_rate=4.5f;
	}
	
	static void updateIntRate(float nrate)
	{
		int_rate=nrate;
	}
	
	
	public Account()
	{
		accno=accno;
		bal=bal;
	}
	
	public Account(String accno, double bal)
	{
		this.accno=accno;
		this.bal=bal;
	}
	
	public static double getIntrate()
	{
		return int_rate;
	}
	
	public void display()
	{
		System.out.println("Account number is: "+accno);
		System.out.println("Account Balance is: "+bal);
		System.out.println("The new Balance with int_rate: "+(bal+(bal*int_rate)));
	}
	
}
