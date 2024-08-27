package  com.baggsy;
import java.text.SimpleDateFormat;

import java.util.Date;
//import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Homepage extends Baggsy {

	String Brand;
	/*String Laptopbags;
	String Studentbags;
	String kidsbags;*/
	int quantity;

	Homepage()
	{
	
		
	}
	
	public Homepage(String Brand,int quantity) 
	{	
		//super();
		this.Brand = Brand;
		this.quantity = quantity;
	}
	

	public void gender_category() {
		System.out.println("Enter 1 to choose for Kids bags");
		System.out.println("Enter 2 to choose for StudentCoaching bags");
		System.out.println("Enter 3 to choose for office Laptop bags");
		System.out.println("Enter 4 to go back");
		System.out.println("Enter 5 for exit");
		//try {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		Homepage h=new Homepage();
		OfficeLaptop l=new OfficeLaptop();
		StudentCoaching s=new StudentCoaching();
		Kids k = new Kids();
		switch (option) {
		case 1: 
			k.category();
			break;
		case 2: // Kids
			
			s.bagspay();
			break;
			
		case 3: // office
			
			l.category();
			break;
			
		case 4:
			
			h.gender_category();
			break;
		case 5:
			System.out.println("ThankYou have a nice and Pleasant day!!!");
			System.exit(0);
		default:
			System.err.println("Enter correct option from above");
			h.gender_category();
		}
	//}
	/*catch(InputMismatchException ref)
	{
		System.err.println("Input mismatch, please enter correct input!!");
		gender_category();
	}*/
	}
	public static void total_bill() {
		for (Map.Entry<String, Double> e : cart.entrySet()) {
			System.out.println(e.getKey() + "  " + e.getValue());
		}
		System.out.println("Enter 1 for UPI");
		System.out.println("Enter 2 for Cash on Delivery");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Payment Done using UPI,Your order is placed!!◡̈◡̈");
			System.out.println("Thanks for Shopping on Baggsy");
			break;
		case 2:
			System.out.println("Payment Done Via Cash,Your order is placed!!◡̈◡̈");
			System.out.println("Thanks for Shopping on Baggsy");
			break;
		}
	}
	
	public static void payment()
	{
	System.out.println("If you want to shop more press 0");
	System.out.println("If you want to checkout press 1");
	Scanner sc=new  Scanner(System.in);
	int option = sc.nextInt();
	if (option == 0) {
		Homepage h=new Homepage();
		h.gender_category();;
	} else if (option == 1) {
		//payment
		us_det_pay();
		total_bill();
	}
	else
	{
		System.out.println("You have pressed wrong option press only 0 or 1");
		payment();
	}
	}
	public static void us_det_pay()
	{
		Baggsy b=new Baggsy();
		//System.out.println("Name:"+b.getName());
		//System.out.println("Address:"+b.getAddress());
		//System.out.println("Location:" +b.getlocation());
		SimpleDateFormat f=new SimpleDateFormat ();
		Date date=new Date();
		System.out.println("Date:" +f.format(date));
		
	}
}

	