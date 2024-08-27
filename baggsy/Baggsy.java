package com.baggsy;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
//import com.baggsy.baggsyabs;

public class Baggsy   implements baggsyabs
{
		private String name;
		private String username;
		private long contact;
		private String email;
		private String date;//
		static String student_id;//for discount
		static String office_id;//for discount
		static String employee_id;//for discount
		private String address;
		private char gender;
		private String password ;
		private String cpassword;
		private String location;
		static boolean isRegistered = false;
		static double  discount;
		static Map<String, Double > cart = new LinkedHashMap<String,Double>();
		boolean b = false;
		static double total;
		
		
		//SignUpOthers============================================
		public  void signup() { //others
			System.out.println("Enter the details to register");
			//System.out.println("");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			name=sc.nextLine();
			System.out.println("Enter your username");
			username=sc.nextLine();
			//System.out.println("Enter your contactno");
			//contact=sc.nextLong();
			contactValidation();
			//System.out.println("");
			//System.out.println("Enter your mail id");
			//email=sc.nextLine();
			emailValidation();
			//System.out.println("");
			System.out.println("Enter your birthdate");
			date =sc.nextLine();
			System.out.println("Enter your address");
			address = sc.nextLine();
			System.out.println("Enter your location");
			//System.out.println("");
			location =sc.nextLine();
			System.out.println("Enter your gender");
			gender = sc.next().charAt(0);
			gen();
			
			//System.out.println("");
			/*System.out.println("Enter your password");
			password=sc.nextLine();
			lengthpass();
			System.out.println("Enter your confirm password");*/
			//passwordValidation();
			lengthpass();
			captcha();
			isRegistered = true;
		}
		
			//SignUpStudent================================================
			 public void studentsignup()//=========================================studentsignup
			{
				System.out.println("Enter the details to register");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name");
				name = sc.nextLine();
				System.out.println("Enter your username");
				username=sc.nextLine();
				contactValidation();
				emailValidation();
				System.out.println("Enter your birthdate");
				date =sc.nextLine();
				System.out.println("Enter your address");
				address = sc.nextLine();
				student_idChecking();
				System.out.println("Enter your location");
				location =sc.nextLine();
				System.out.println("Enter your gender");
				gender = sc.next().charAt(0);
				gen();
				lengthpass();
				captcha();
				isRegistered = true;
			}
			
			 //EmployeeSignUp=======================================
			 public void employeesignup()//==============================employeesignup
			{
				System.out.println("Enter the details to register");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name");
				name = sc.nextLine();
				System.out.println("Enter your username");
				username=sc.nextLine();
				contactValidation();
				emailValidation();
				System.out.println("Enter your birthdate");
				date =sc.nextLine();
				//System.out.println("who is signup up employee or office??press ")
				//employee_idChecking();
				idcheck();
				System.out.println("Enter your address");
				address = sc.nextLine();
				System.out.println("Enter your location");
				location =sc.nextLine();
				System.out.println("Enter your gender");
				gender = sc.next().charAt(0);
				gen();
				lengthpass();
				captcha();
				isRegistered = true;
			}
			 
			 public static void idcheck()
			 {
				 System.out.println("Who is signing employee or office?if employee press e or o");
				 Scanner sc=new Scanner(System.in);
				 char confirm = sc.next().charAt(0);
				 if(confirm =='e'||confirm =='E')
				 {
					 employee_idChecking();
				 }
				 else if( confirm =='o' ||confirm =='O')
				 {
					 office_idChecking();
					 
				 }
				 else
				 {
					 System.out.println("Enter valid choice");
					 idcheck();
					 
				 }
				 
			 }
			
			 //Studentidchecking===================================
			 public static void student_idChecking()
			 {
				 Scanner sc = new Scanner(System.in);
					System.out.println("Enter your student id");
					student_id = sc.nextLine();
					if (student_id .startsWith("STU") && (student_id.endsWith("2023")|| student_id.endsWith("2024"))) {
						System.out.println("Valid ID ,your id is available for discounts");
					} 
					else if(student_id .startsWith("STU") && (!(student_id.endsWith("2023")|| student_id.endsWith("2024"))))
					{
					System.out.println("only 2023 and 2024 are allowed for discounts");	
					}
					
					else
					{
						System.err.println("Invalid Try Again");
						student_idChecking();
					}
				 
			 }
			 
			 //office_id checking==========================
			 public static void office_idChecking()
			 {
				 Scanner sc = new Scanner(System.in);
					System.out.println("Enter your employee id");
					office_id = sc.nextLine();
					if (office_id .equals("ACCENTURE123") ||office_id .equals("TCS123") ) {
						System.out.println("Valid OFFICE ID ,your id is available for discounts");
					} 
					else
					{
						System.err.println("Invalid Try Again");
						office_idChecking();
					}
				 
			 }
			 
			 public static void employee_idChecking()
			 {
				 Scanner sc = new Scanner(System.in);
					System.out.println("Enter your employee id");
					//System.out.println("Hint:Starts with ACC and TCS");
					employee_id = sc.nextLine();
					if (employee_id .startsWith("ACC") ||employee_id .startsWith("TCS") )
					{
						if(employee_id.length()==8)
						{
						System.out.println("Valid employee id ,your id is available for discounts");
						}
						else
						{
							System.err.println("ID should of only 8 characters");
							employee_idChecking();
						}
					} 
					else
					{
						System.err.println("Invalid Try Again");
						employee_idChecking();
					}
				 
			 }
			 
			
			
			//PASSWORD CHECKING login time=========================================
			 public void passwordchecking()
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the password to login");
			String password = sc.nextLine();
			if (password.equals(this.password)) {
				System.out.println("Login Successful");
				b = true;
				Homepage h=new Homepage();
				h.gender_category();
				
			} else {
				System.err.println("Enter valid password");
				login();
			}
			}
			
			
			//Login================================================================
			public  void login() 
			{
				if (isRegistered == false) 
				{
					System.out.println("No account existed please register");
					signup();
				}
				System.out.println("Please proceed for Login");
				Scanner sc = new Scanner(System.in);
				System.out.println("Press 1 to login with username and password");
				System.out.println("Press 2 to login with contact number");
				System.out.println("Press 3 to login with email id");
				int x = sc.nextInt();
						switch (x)
						{
						case 1:
							//Scanner sc=new Scanner(System.in);
							System.out.println("Enter your username:");
							String username=sc.next();
							//System.out.println("Enter your password");
							//String password =sca.next();
							//System.out.println("Enter your Password:");
							//String password=sca.next();
							if(username.equals(this.username))
							{
								System.out.println("Valid");
								passwordchecking();
								//hp.Homepage();
							} else 
							{
								System.err.println("Please enter correct username");
								login();
								//Scanner sca=new Scanner(System.in);
								//System.out.println("Enter your username:");
								//String username1=sca.next();
							}
							break;
							case 2:
							System.out.println("Enter contact number");
							long contact = sc.nextLong();
							sc.nextLine();
							if (contact == this.contact)
							{
								System.out.println("Valid");
								passwordchecking();
							} 
							else
							{
								System.err.println("Try again!!!");
								login();
							}
							break;
						case 3:
							System.out.println("Enter your mail id");
							sc.nextLine();
							String email = sc.nextLine();
							if (email.equals(this.email)) 
							{
								System.out.println("Valid email");
								passwordchecking();
							}
							else
							{
								System.err.println("Try again!!!");
								login();
							}
							break;
			
						default:
							System.err.println("Try Again!!!");
							login();
						}

			}
		
		
			
			//=============================================================================captcha
			@Override
			public void captcha() {
			String captcha = "";
			Random r = new Random();
			while (captcha.length() < 6) {
				int n = r.nextInt(123);// ---> 0 to 122
				if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
					captcha = captcha + (char) n;
				}
			}
			System.out.println(captcha);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the above captcha");
			String userCaptcha = sc.nextLine();
			if (captcha.equals(userCaptcha)) {
				System.out.println("Successful");
			} else {
				System.err.println("Try Again!!!");
				captcha();
			}
			}
			
			@Override
			public void lengthpass()//================================= password length
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your password");
				password = sc.nextLine();
				//lengthpass();
				
			if(password.length()==8)
			{
				System.out.println("Strong password");
				System.out.println("Enter password to confirm");
				//Scanner sc=new Scanner(System.in);
				cpassword = sc.nextLine();
				if (password.equals(cpassword) ) {
					System.out.println("Password Match");
				} else {
					System.err.println("Those passwords didn't match. Try Again!!");
					//passwordValidation();
					lengthpass();
				}
			}
			else
			{
				System.out.println("Weak Password");
				lengthpass();
				//Scanner sc=new Scanner(System.in);
				
				//System.out.println("Enter password with 8 characters");
				//passwordValidation();
			}
			}
			
			@Override
			public void gen()
			{
				if(gender=='f' ||gender=='F' || gender=='m'|| gender=='M')
				{
					System.out.println("Valid gender");
					
					
				}
				else
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Please enter correct gender in m or f");
					gender = sc.next().charAt(0);
					gen();
				}
			}
			
			
	//=========================================================email validation
			@Override 
	public void emailValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id");
		email = sc.nextLine();
		if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")) {
			System.out.println("Valid Mail");
		} else
		{
			System.err.println("Invalid Try Again");
			emailValidation();
		}
	}
	
	//========================================================================contact validation
	@Override
	public void contactValidation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your contact details");
		try {
			contact = sc.nextLong();
			if (contact > 999999999L && contact < 10000000000L) {
				System.out.println("Contact Valid");
			} else {
				System.err.println("Enter 10 digits number");
				contactValidation(); // method recursion
			}
		} catch (InputMismatchException ime) {
			System.err.println("Enter numbers only");
			contactValidation();
		}
	}
	//=====================================================getter setter methods  for private variables
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public String getuserName() {
		return username;
	}

	public void setuserName(String username) {
		this.username = username;
	}
	public String getdate()
	{
		return date;
	}
	public void  setdate(String date)
	{
		this.date=date;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) 
		{
			this.gender = gender;
		}
	
	public String getlocation() {
		return location;
	}

	public void setLocation(String location) 
		{
			this.location = location;
		}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getCpassword()
	{
		return cpassword;
	}
	public void setcPassword(String cpassword)
	{
		this.cpassword=cpassword;
	}
	
	
	/*Baggsy(String name,String username,long contact,String email,String date,String address,char gender,String password,String cpassword,String location)
	{
		setName(name);
		setuserName(username);
		setdate(date);
		setContact(contact);
		setEmail(email);
		setAddress(address);
		setGender(gender);
		setLocation(location);
		setPassword(password);
		setEmail(email);
		setAddress(address);
		setGender(gender);
		setLocation(location);
		setPassword(password);
		setcPassword(cpassword);	
	}*/

	

	
	}


	




