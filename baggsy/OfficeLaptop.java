package com.baggsy;
import com.baggsy.Baggsy;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class OfficeLaptop extends Homepage implements baggsyabs,Baggsabs 
{
	
	//Category=========================================
	public void category() 
	{
		System.out.println("What kind of Laptop bag you want?");
		System.out.println("Enter 1 for Briefcase Type");
		System.out.println("Enter 2 for Backpack Type");
		System.out.println("Enter 3 for going back");
	
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option)
		{
			case 1:
				Briefcase();
				break;
			case 2:
				Backpack();
				break;
			case 3:
				gender_category();
				break;
			default:
				System.err.println("Invalid");
				category();
		}
		
		
		}
	
	
	public static void office_disc()//for discount
	{	
		System.out.println("Please reenter  office id:");
		Scanner sc=new Scanner(System.in);
		String off=sc.nextLine();
		if (office_id.equals(off) )
		{
			System.out.println("ID Matched!!!");
			System.out.println("Wow!! you are getting 20%  discount");
		}
		else
		{
			System.out.println("ID not Matched ,Please enter correct id!! ");
		}
		
	}
	public static void employee_disc()//for discount
	{	
		System.out.println("Please reenter  employee id:");
		Scanner sc=new Scanner(System.in);
		String emp=sc.nextLine();
		if (employee_id.equals(emp) )
		{
			System.out.println("ID Matched!!!");
			System.out.println("Wow!! you are getting 20%  discount");
		}
		else
		{
			System.out.println("ID not Matched ,Please enter correct id!! ");
		}
		
	}
	//BriefCase=================================================================
	public void	Briefcase()
	{//1	
			//Brand();
					
					System.out.println("Who is is buying employee or office?");
					System.out.println("Press e for employee  or o for office");
					Scanner sc = new Scanner(System.in);
					char buy = sc.next().charAt(0);
					//
					if(buy=='o' ||buy=='O')
					{ 	
							
							//if( quantity >=50  )
							//{//System.out.println("Enter if you want bottle with bag");
								System.out.println("Enter 1 for Dell Briefcase bag $20");
								System.out.println("Enter 2 for  Hp Briefcase bag price $22");
								System.out.println("Enter 3 for  Skybags Briefcase bagprice $18");
								System.out.println("Enter 4 for  Welsey Briefcase bag price $15");
								
								if (isRegistered == true) 
								{
									System.out.println("Please Register before proceeding");
									employeesignup();
									login();
									category();
								}
								int option = sc.nextInt();
								switch (option)
								//
								{
									case 1:
										System.out.println("You have Choosen Dell Briefcase Bag");
										System.out.println("Press Y to confirm purchase");
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										char confirm = sc.next().charAt(0);
										if (confirm == 'y' || confirm == 'Y') 
										{
											if(quantity>=100)
											{	office_disc();
												////System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*20*quantity;
											}
											else
											{
											total = total + quantity*20;
											}
											cart.put("Dell Briefcase Bag", total);
										//payment();
										}
										else {
									Briefcase();
								}payment();
										break;
									case 2:
										System.out.println("You have Choosen Hp Briefcase bag ");
										System.out.println("Press Y to confirm purchase");
										confirm = sc.next().charAt(0);
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										if (confirm == 'y' || confirm == 'Y') 
										{
											if(quantity>=100)
											{	office_disc();
												//System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*22*quantity;
											}
											else
											{
											total = total + quantity*22;
											}
											//total = total +  quantity*22;
											cart.put("Hp Briefcase bag", total);
										//payment();
								}else {
									Briefcase();
								}payment();
										break;
								case 3:
									System.out.println("You have Choosen Skybags Briefcase bag ");
									System.out.println("Press Y to confirm purchase");
									System.out.println("Enter the Quantity:");
									quantity = sc.nextInt();
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y')
									{
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*18*quantity;
										}
										else
										{
										total = total + quantity*18;
										}
										//total = total + 18* quantity;
										cart.put(" Skybags Briefcase bag", total);
									 //payment();
								}else {
									Briefcase();
								}payment();
									break;
								case 4:
									System.out.println("You have Choosen Welsey Briefcase bag  ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									System.out.println("Enter the Quantity:");
									quantity = sc.nextInt();
									if (confirm == 'y' || confirm == 'Y')
									{
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*15*quantity;
										}
										else
										{
										total = total + quantity*15;
										}
										//total = total + 22* quantity;
										cart.put("Welsey Briefcase bag", total);
									}else {
									Briefcase();
								}payment();
									break;
			
								default:
									System.err.println("Invalid");
									Briefcase();
							}//switch
					
					
					
	}
	//end if o or O		
								
								else if(buy =='e' ||buy=='E')
								{ 	
									//System.out.println("Enter if you want bottle with bag");
									System.out.println("Enter 1 for Dell Briefcase bag $20");
									System.out.println("Enter 2 for  Hp Briefcase bag price $22");
									System.out.println("Enter 3 for  Skybags Briefcase bagprice $18");
									System.out.println("Enter 4 for  Welsey Briefcase bag price $15");
									
									//int option = sc.nextInt();
									if (isRegistered == false) 
									{
										System.out.println("Please Register before proceeding");
										employeesignup();
										login();
										category();
										
									}
									int option = sc.nextInt();
									switch (option)
									
									{
										case 1:
										System.out.println("You have Choosen Dell Briefcase Bag");
										System.out.println("Press Y to confirm purchase");
										char confirm = sc.next().charAt(0);
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										if (confirm == 'y' || confirm == 'Y') 
										{
											
											if(quantity>=2)
											{	employee_disc();
												//System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*20*quantity;
											}
											else
											{
											total = total + quantity*20;
											}
											//total = total + quantity*10*20/100;
											cart.put("Dell Briefcase Bag", total);
										}else {
											Briefcase();
										}payment();
										break;
									case 2:
										System.out.println("You have Choosen Hp Briefcase bag ");
										System.out.println("Press Y to confirm purchase");
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										confirm = sc.next().charAt(0);
										if (confirm == 'y' || confirm == 'Y') {
											if(quantity>=2)
											{	employee_disc();
												//System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*22*quantity;
											}
										else
											{
											total = total + quantity*22;
											}
											//total = total + quantity*10*20/100;
											cart.put("Hp Briefcase bag", total);
										}else {
											Briefcase();
										}payment();
										break;
									case 3:
										System.out.println("You have Choosen Skybags Briefcase bag ");
										System.out.println("Press Y to confirm purchase");
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										confirm = sc.next().charAt(0);
										if (confirm == 'y' || confirm == 'Y') {
											if(quantity>=2)
											{	employee_disc();
												//System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*18*quantity;
											}
											else
											{
											total = total + quantity*18;
											}
											//total = total + quantity*10*20/100;
											//cart.put("Dell Briefcase Bag", total);
									
											//total = total + 18* quantity;
											cart.put(" Skybags Briefcase bag", total);
										} else {
											Briefcase();
										}payment();
										break;
									case 4:
										System.out.println("You have Choosen Welsey Briefcase bag  ");
										System.out.println("Press Y to confirm purchase");
										System.out.println("Enter the Quantity:");
										quantity = sc.nextInt();
										confirm = sc.next().charAt(0);
										if (confirm == 'y' || confirm == 'Y') {
											if(quantity>=2)
											{	employee_disc();
												//System.out.println("Wow!! you are getting 20%  discount");
												total =total+.2*15*quantity;
											}
											else
											{
											total = total + quantity*15;
											}
											//total = total + quantity*10*20/100;
											
											//total = total + 22* quantity;
											cart.put("Welsey Briefcase bag", total);
										} else {
											Briefcase();
										}payment();
										break;
				
									default:
										System.err.println("Invalid");
										Briefcase();
									}//switch
							}//else if
							 
								//enter quan o or e		}			
					else
					{
						//System.err.println("Please enter quantity greater than 50 and office id ACC or TCS");
						System.out.println("enter only o or e");
						Briefcase();
						
					}
								/*catch(InputMismatchException ref)
								{
									System.err.println("Input mismatch !! please enter correct input");
									Briefcase();
								}*/
	}

	
	
		//BackPack===========================================================
			public void	Backpack()
			{//1	
			
							System.out.println("Who is is buying employee or office?");
							System.out.println("Press e for employee  or o for office");
							//try {
							Scanner sc = new Scanner(System.in);
							char buy = sc.next().charAt(0);
							if(buy=='o' ||buy=='O')
							{  
							
							
							//2
							
							//System.out.println("Enter if you want bottle with bag");
								System.out.println("Enter 1 for Dell Backpack bag $20");
								System.out.println("Enter 2 for  Hp Backpack bag price $22");
								System.out.println("Enter 3 for  Skybags Backpack bagprice $18");
								System.out.println("Enter 4 for  Welsey Backpack bag price $15");
								
								int option = sc.nextInt();
								
								if (isRegistered == false) {
									System.out.println("Please Register before proceeding");
									employeesignup();
									login();
									category();
								}
								switch (option)
								{	
									
									case 1:
									System.out.println("You have Choosen Dell Backpack Bag");
									System.out.println("Press Y to confirm purchase");
									char confirm = sc.next().charAt(0);
									System.out.println("Enter the Quantity:");
									quantity = sc.nextInt();
								
									if (confirm == 'y' || confirm == 'Y') {
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*20*quantity;
										}
										else
										{
										total = total + quantity*20;
										}
								
									//total = total + quantity*50*20/100;
										cart.put("Dell Backpack Bag", total);
									}else {
										Backpack();
									}payment();
									break;
								case 2:
									System.out.println("You have Choosen Hp Backpack bag ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*22*quantity;
										}
										else
										{
										total = total + quantity*22;
										}
										//total = total +  quantity*50*22/100;
										cart.put("Hp Backpack bag", total);
									} else {
										Backpack();
									}payment();
									break;
								case 3:
									System.out.println("You have Choosen Skybags Backpack bag ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*18*quantity;
										}
										else
										{
										total = total + quantity*18;
										}
										//total = total + 18* quantity;
										cart.put(" Skybags Backpack bag", total);
									}else {
										Backpack();
									}payment();
									break;
								case 4:
									System.out.println("You have Choosen Welsey Backpack bag  ");
									System.out.println("Press Y to confirm purchase");
									confirm = sc.next().charAt(0);
									if (confirm == 'y' || confirm == 'Y') {
										if(quantity>=100)
										{	office_disc();
											//System.out.println("Wow!! you are getting 20%  discount");
											total =total+.2*15*quantity;
										}
										else
										{
										total = total + quantity*15;
										}
										//total = total + 22* quantity;
										cart.put("Welsey Backpack bag", total);
									}else {
										Backpack();
									}payment();
									break;
			
							default:
								System.err.println("Invalid");
								Backpack();
						}//switch
						}//if
							else if(buy=='e' ||buy=='E')
							{
								      //System.out.println("Enter if you want bottle with bag");
										System.out.println("Enter 1 for Dell Backpack bag $20");
										System.out.println("Enter 2 for  Hp Backpack bag price $22");
										System.out.println("Enter 3 for  Skybags Backpack bagprice $18");
										System.out.println("Enter 4 for  Welsey Backpack bag price $15");
										System.out.println("Enter the Quantity:");
										
										if (isRegistered == false) {
											System.out.println("Please Register before proceeding");
											employeesignup();
											login();
											category();
											
										}
										Scanner sc1 =new Scanner(System.in);
										int option = sc1.nextInt();
										switch (option)
										{	
											
											case 1:
											System.out.println("You have Choosen Dell Backpack Bag");
											System.out.println("Press Y to confirm purchase");
											char confirm = sc.next().charAt(0);
											quantity = sc.nextInt();
											
											if (confirm == 'y' || confirm == 'Y') {
												if(quantity>=2)
												{	employee_disc();
													//System.out.println("Wow!! you are getting 20%  discount");
													total =total+.2*20*quantity;
												}
												else
												{
												total = total + quantity*20;
												}
												//total = total + quantity*10*20/100;
												cart.put("Dell Backpack Bag", total);
											} else {
												Backpack();
											}payment();
											break;
										case 2:
											System.out.println("You have Choosen Hp Backpack bag ");
											System.out.println("Press Y to confirm purchase");
											confirm = sc.next().charAt(0);
											quantity = sc.nextInt();
											//int option = sc.nextInt();
											if (confirm == 'y' || confirm == 'Y') {
												if(quantity>=2)
												{	employee_disc();
													//System.out.println("Wow!! you are getting 20%  discount");
													total =total+.2*22*quantity;
												}
												else
												{
												total = total + quantity*22;
												}
												//total = total +  quantity*50*22/100;
												cart.put("Hp Backpack bag", total);
											} else {
												Backpack();
											}payment();
											break;
										case 3:
											System.out.println("You have Choosen Skybags Backpack bag ");
											System.out.println("Press Y to confirm purchase");
											confirm = sc.next().charAt(0);
											quantity = sc.nextInt();
											//int option = sc.nextInt();
											if (confirm == 'y' || confirm == 'Y') {
												if(quantity>=2)
												{	employee_disc();
													//System.out.println("Wow!! you are getting 20%  discount");
													total =total+.2*18*quantity;
												}
												else
												{
												total = total + quantity*18;
												}
												//total = total + 18* quantity;
												cart.put(" Skybags Backpack bag", total);
											} else {
												Backpack();
											}payment();
											break;
										case 4:
											System.out.println("You have Choosen Welsey Backpack bag  ");
											System.out.println("Press Y to confirm purchase");
											confirm = sc.next().charAt(0);
											quantity = sc.nextInt();
											//int option = sc.nextInt();
											if (confirm == 'y' || confirm == 'Y') {
												if(quantity>=2)
												{	employee_disc();
													//System.out.println("Wow!! you are getting 20%  discount");
													total =total+.2*15*quantity;
												}
												else
												{
												total = total + quantity*15;
												}
												//total = total + 22* quantity;
												cart.put("Welsey Backpack bag", total);
											} else {
												Backpack();
											}payment();
											break;

									default:
										System.err.println("Invalid");
										Backpack();
										}
										}
						
					else
					{
						System.err.println("Please enter quantity greater than 50 and office id ACC or TCS");
					}
						
					}
						/*catch(InputMismatchException ref )
							{
							System.out.println("Input mismatch!!!Please enter correct input");
							Backpack();
							}*/
			
			
							}
			
			//Backpack
			//office


