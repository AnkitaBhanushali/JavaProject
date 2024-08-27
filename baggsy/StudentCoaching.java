package com.baggsy;
import com.baggsy.Baggsy;


//import java.util.InputMismatchException;
import java.util.Scanner;
public class StudentCoaching extends Homepage 
{
	
	//========================================================
	public void bagspay()
		{					
							System.out.println("Enter 1 for Byju's bags $20");
							System.out.println("Enter 2 for Vedantu bags $22");
							System.out.println("Enter 3 for Allen bags $18");
							System.out.println("Enter 4 for Resonance  bags $15");
							System.out.println("Enter 5 to go back");
							//try
							//{
							Scanner sc=new Scanner(System.in);
							int option = sc.nextInt();
							System.out.println("Enter the Quantity");
							quantity = sc.nextInt();
							if( quantity >=50  )
							{//System.out.println("Enter if you want bottle with bag");
							
							if (isRegistered == true) {
								System.out.println("Please Register before proceeding");
								signup();
								login();
								bagspay();
							}
							switch (option)
							//3
							{
								case 1:
								System.out.println("You have Choosen Byuj's Bag");
								System.out.println("Press Y to confirm purchase");
								char confirm = sc.next().charAt(0);
								if (confirm == 'y' || confirm == 'Y') {
									if(quantity>=100)
									{
										System.out.println("Wow!! you are getting 20%  discount");
										total =total+.2*20*quantity;
									}
									else
									{
										total = total + quantity*20;
									}
									
									cart.put("Byuj's bag", total);
								} else {
									bagspay();
								}payment();
								break;
							case 2:
								System.out.println("You have Choosen Vedantu bag ");
								System.out.println("Press Y to confirm purchase");
								confirm = sc.next().charAt(0);
								if (confirm == 'y' || confirm == 'Y') {
									if(quantity>=100)
									{
										System.out.println("Wow!! you are getting 20%  discount");
										total =total+.2*22*quantity;
									}
									else
									{
									total = total +  quantity*22;
									}
									cart.put("Vedantu  bag", total);
								} else {
									bagspay();
								}payment();
								break;
							case 3:
								System.out.println("You have Choosen Allen  bag ");
								System.out.println("Press Y to confirm purchase");
								confirm = sc.next().charAt(0);
								if (confirm == 'y' || confirm == 'Y') {
									if(quantity>=100)
									{
										System.out.println("Wow!! you are getting 20%  discount");
										total =total+.2*18*quantity;
									}
									else {
									total = total + 18* quantity;}
									cart.put(" Allen  bag", total);
								} else {
									bagspay();
								}payment();
								break;
							case 4:
								System.out.println("You have Choosen Resonance  bag  ");
								System.out.println("Press Y to confirm purchase");
								confirm = sc.next().charAt(0);
								if (confirm == 'y' || confirm == 'Y') {
									if(quantity>=100)
									{
										System.out.println("Wow!! you are getting 20%  discount");
										total =total+.2*15*quantity;
									}
									else {
									total = total + 15* quantity;}
									cart.put("Resonance  bag", total);
								} else {
									bagspay();
								}payment();
								break;
		
						default:
							System.err.println("Invalid");
							bagspay();
							}//end of switch
					}//end of if
					else
					{
						System.out.println("please enter quantity greater than 50");
						bagspay();
					}
							/*}
							catch(InputMismatchException ref)
							{
								System.err.println("Input mismatch!!!,Please enter correct input");
							}*/
					
							
		}//end of bagspay
					
		
}//end of class

	