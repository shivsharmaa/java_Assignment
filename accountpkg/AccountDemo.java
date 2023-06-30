package accountpkg;

public class AccountDemo {
	public static void main(String[] args) {
		Account ac=new Account("2481108034860", 7455.45);
		
		System.out.println("The updated Balace is: "+Account.getIntrate());
		System.out.println();
		ac.display();
	
		Account.updateIntRate(7.5f);
		System.out.println("The Current Updated int_Rate is:"+Account.getIntrate());
		ac.display();
	
	}
}
