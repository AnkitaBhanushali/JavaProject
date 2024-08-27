package com.baggsy;

//import java.util.InputMismatchException;
import java.util.Scanner;
import com.baggsy.Baggsy;
//import com.baggsy.homepage;

public class Driver
{

		static
		{	System.out.println("************************************************************************");
			System.out.println("Hello!!...Welcome to Baggsy◡̈◡̈◡̈                ");
			System.out.println("Store anything and everything in Baggsy                ");
			System.out.println("Student,Office Employee,or any bag lovers shop in baggsy                ");
			System.out.println("***********************************************************************");
			//System.out.println("Search for products:");
		}
		public static void main(String[] args)
		{	
		// TODO Auto-generated method stub
		
			
			System.out.println("Enter 1 to Register for Student");
			System.out.println("Enter 2 to Register for employee");
			System.out.println("Enter 3 Registration for others");
			System.out.println("Enter 4 to Login");
			System.out.println("Enter 5 to Guest Login");
			System.out.println("Enter 6 to Exit");
			/*try
			{*/
			Scanner sc = new Scanner(System.in);
			//ShopAbst s = new Shop(); // Upcasting
			//Baggsy n=new Baggsy();
			Baggsy s= new Baggsy();
			
			int n = sc.nextInt();
			switch (n) 
			{
				case 1:
					s.studentsignup();
					s.login();
					break;
				case 2:
					s.employeesignup();
					s.login();
					break;
				case 3:
					s.signup();
					s.login();
					break;
				case 4:
					s.login();
					break;
				case 5:
					Homepage h=new Homepage();
					h.gender_category();
					break;
				case 6:
					System.out.println("Thank You have nice and Pleasant day!!!◡̈◡̈◡̈");
					System.exit(0);
					break;
				default:
					System.err.println("Please enter given options only !!");
					main(null);
			}
			
			/*catch(InputMismatchException ref)
			{
				System.out.println("Input mismatch ,Please enter correct input!!");
				main(args);
			}*/
			

		}
}