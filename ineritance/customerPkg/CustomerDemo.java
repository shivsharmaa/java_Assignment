package customerPkg;
import java.util.*;


public class CustomerDemo {
	public static void main(String[] args) {
		
		int choice = 0;
		
		System.out.println("1 for registered customer and 2 for customer");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Price");
		double price = sc.nextDouble();
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		System.out.println("Enter emailid");
		
		String e=sc.next();
		System.out.println("Enter city");
		String c=sc.next();
		System.out.println("Enter area");
		String a=sc.next();
		System.out.println("Enter pincode");
		String p=sc.next();
		
		
		
		if(choice==2)
		{
			
			Customer c1=new Customer(e, c, a, p);
			c1.toString();
			//c1.giveDiscount(price);
			System.out.println(price);
			
		}
		
		else if(choice==1)
		{
			
			System.out.println("Enter reg customer id");
			int reg_no=sc.nextInt();
			RegCustomer rg=new RegCustomer(e, c, a, p, reg_no);
			rg.giveDiscount(price);
		}
	}
}
