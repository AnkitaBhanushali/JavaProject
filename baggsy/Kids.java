package com.baggsy;
//import java.util.InputMismatchException;

import java.util.Scanner;

public class Kids extends Homepage implements Baggsabs,baggsyabs
{
	//=========================================
	public void category() 
	{
		System.out.println("Enter 1 for Barbie Cartoon bag");
		System.out.println("Enter 2 for Doremon Cartoon bag");
		System.out.println("Enter 3 for Unicorn Cartoon bag");
		System.out.println("Enter 4 for Space  bag");
		System.out.println("Enter 5 to go back");
		//try {
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option)
		{
		case 1:
			Barbie();
			break;
		case 2:
			Doremon();
			break;
		case 3:
			Unicorn();
			break;
		case 4:
			Space();
			break;
		case 5:
			gender_category();
			break;
		default:
			System.err.println("Invalid");
			category();
		}
		//}
		/*catch(InputMismatchException ref)
		{
			System.err.println("Input mismatch,Please enter correct input!!");
			category();
		}*/
	}
	
	public static void tot() {
		if(total>100)
		{
			System.out.println("Wopppieee you got a bottle free");
		}
	}
	
	public void	Barbie()
	{			//System.out.println("Enter if you want bottle with bag");
				System.out.println("Enter 1 for Nike Barbie price $20");
				System.out.println("Enter 2 for  Adidas Barbie price $22");
				System.out.println("Enter 3 for  Priority Barbie price $18");
				System.out.println("Enter 4 for  Wildcraft Barbie price $15");
				//try {
				Scanner sc = new Scanner(System.in);
				int option = sc.nextInt();
				if (isRegistered == false) //time being false
				{
					System.out.println("Please Register before proceeding");
					signup();
					login();
					Barbie();
				}
				
				switch (option) 
				{
				case 1:
					
					System.out.println("You have Choosen Nike Barbie Bag");
					System.out.println("Press Y to confirm purchase");
					char confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						System.out.println("Enter the Quantity");
						quantity = sc.nextInt();
						total = total + 20*quantity;
						tot();
						cart.put("Nike Barbie Bag", total);
					} else {
						Barbie();
					}payment();
					break;
				case 2:
					
					System.out.println("You have Choosen Adidas Barbie Bag ");
					System.out.println("Press Y to confirm purchase");
					confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						System.out.println("Enter the Quantity");
						quantity = sc.nextInt();
						total = total + 22*quantity;
						tot();
						cart.put("Adidas Barbie Bag", total);
					} else {
						Barbie();
					}payment();
					break;
				case 3:
					
					System.out.println("You have Choosen Priority Barbie Bag ");
					System.out.println("Press Y to confirm purchase");
					confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						System.out.println("Enter the Quantity");
						quantity = sc.nextInt();
						total = total + 18*quantity;
						tot();
						cart.put(" Priority Barbie Bag", total);
					} else {
						Barbie();
					}payment();
					break;
				case 4:
					
					System.out.println("You have Choosen WildCraft Barbie Bag ");
					System.out.println("Press Y to confirm purchase");
					confirm = sc.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y') {
						System.out.println("Enter the Quantity");
						quantity = sc.nextInt();
						total = total + 15*quantity;
						tot();
						cart.put("Adidas Barbie Bag", total);
					} else {
						Barbie();
					}payment();
					break;
			default:
				System.err.println("Invalid");
				Barbie();
			}//end of inner switch
			}
				/*catch(InputMismatchException ref)
				{
				System.err.println("Input mismatch!!!,Please enter correct input");
				Barbie();
				}*/


			//Doremon===================================
			public void	Doremon()
			{	
						//System.out.println("Enter if you want bottle with bag");
						System.out.println("Enter 1 for Nike Doremon price $20");
						System.out.println("Enter 2 for  Adidas Doremon price $22");
						System.out.println("Enter 3 for  Priority Doremon price $18");
						System.out.println("Enter 4 for  Wildcraft Doremon price $15");
						//try {
						Scanner sc=new Scanner(System.in);
						int option = sc.nextInt();
						
						if (isRegistered == false) {
							System.out.println("Please Register before proceeding");
							signup();
							login();
							Doremon();
						}
						switch (option) {
						case 1:
							System.out.println("You have Choosen Nike Doremon  Bag");
							System.out.println("Press Y to confirm purchase");
							char confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 20*quantity;
								tot();
								cart.put("Nike Doremon Bag", total);
							} else {
								Doremon();
							}payment();
							break;
						case 2:
							System.out.println("You have Choosen Adidas Doremon Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 22*quantity;
								tot();
								cart.put("Adidas Doremon Bag", total);
							} else {
								Doremon();
							}payment();
							break;
						case 3:
							System.out.println("You have Choosen Priority Doremon Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 18*quantity;
								tot();
								cart.put(" Priority Doremon Bag", total);
							} else {
								Doremon();
							}payment();
							break;
						case 4:
							System.out.println("You have Choosen WildCraft Doremon Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 15*quantity;
								tot();
								cart.put("WildCraft Doremon Bag", total);
							} else {
								Doremon();
							}payment();
							break;
							default:
							System.err.println("Invalid");
							Doremon();
						}
						}
						/*catch(InputMismatchException ref)
						{
							System.err.println("Input Mismatch,Please enter correct input");
							Doremon();
						}*/

						
						
					
			
			//Unicorn==================================================
			public void	Unicorn()
					{	//System.out.println("Enter if you want bottle with bag");
								System.out.println("Enter 1 for Nike Unicorn price $20");
								System.out.println("Enter 2 for  Adidas Unicorn price $22");
								System.out.println("Enter 3 for  Priority Unicorn price $18");
								System.out.println("Enter 4 for  Wildcraft Unicorn price $15");
								//try {
								Scanner sc=new Scanner(System.in);
								int option = sc.nextInt();
								if (isRegistered == false) {
									System.out.println("Please Register before proceeding");
									signup();
									login();
									Unicorn();
								}
								switch (option) {
								case 1:
									System.out.println("You have Choosen Nike Unicorn  Bag");
									System.out.println("Press Y to confirm purchase");
									char confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										System.out.println("Enter the Quantity");
										quantity = sc.nextInt();
										total = total + 20*quantity;
										tot();
										cart.put("Nike Unicorn Bag", total);
									} else {
										Unicorn();
									}payment();
									break;
								case 2:
									System.out.println("You have Choosen Adidas Unicorn Bag ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										System.out.println("Enter the Quantity");
										quantity = sc.nextInt();
										total = total + 22*quantity;
										tot();
										cart.put("Adidas Unicorn Bag", total);
									} else {
										Unicorn();
									}payment();
									break;
								case 3:
									System.out.println("You have Choosen Priority Unicorn Bag ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										System.out.println("Enter the Quantity");
										quantity = sc.nextInt();
										total = total + 18*quantity;
										tot();
										cart.put(" Priority Unicorn Bag", total);
									} else {
										Unicorn();
									}payment();
									break;
								case 4:
									System.out.println("You have Choosen WildCraft Unicorn Bag ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										System.out.println("Enter the Quantity");
										quantity = sc.nextInt();
										total = total + 15*quantity;
										tot();
										cart.put("WildCraft Unicorn Bag", total);
									} else {
										Unicorn();
									}payment();
									break;
								

							default:
								System.err.println("Invalid");
								Unicorn();
							}
								/*}catch(InputMismatchException ref)
								{
									System.err.println("Input Mismatch,Please enter correct input");
									Unicorn();
								}*/

			
			
}

		

				
			//Space===============================
			public void	Space()
			{	
					
					
						//System.out.println("Enter if you want bottle with bag");
						System.out.println("Enter 1 for Nike Space price $20");
						System.out.println("Enter 2 for  Adidas Space price $22");
						System.out.println("Enter 3 for  Priority Space price $18");
						System.out.println("Enter 4 for  Wildcraft Space price $15");
						//System.out.println("Enter the Quantity");
						//quantity = sc.nextInt();
						//try {
						Scanner sc=new Scanner(System.in);
						int option = sc.nextInt();
						if (isRegistered == false) {
							System.out.println("Please Register before proceeding");
							signup();
							login();
							Space();
						}
						switch (option) {
						case 1:
							System.out.println("You have Choosen Nike Space  Bag");
							System.out.println("Press Y to confirm purchase");
							char confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 20*quantity;
								tot();
								cart.put("Nike Space Bag", total);
							} else {
								Space();
							}payment();
							break;
						case 2:
							System.out.println("You have Choosen Adidas Space Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 22*quantity;
								tot();
								cart.put("Adidas Space Bag", total);
							} else {
								Space();
							}payment();
							break;
						case 3:
							System.out.println("You have Choosen Priority Space Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 18*quantity;
								tot();
								cart.put(" Priority Space Bag", total);
							} else {
								Space();
							}payment();
							break;
						case 4:
							System.out.println("You have Choosen WildCraft Space Bag ");
							System.out.println("Press Y to confirm purchase");
							confirm = sc.next().charAt(0);
							if (confirm == 'y' || confirm == 'Y') {
								System.out.println("Enter the Quantity");
								quantity = sc.nextInt();
								total = total + 15*quantity;
								tot();
								cart.put("WildCraft Space Bag", total);
							} else {
								Space();
							}
							break;
						default:
							System.err.println("Invalid");
							Space();
						}
						/*}catch(InputMismatchException ref)
						{
							System.err.println("Input Mismatch,Please enter correct input");
							Space();
						}*/


					
					}

			
	


			}