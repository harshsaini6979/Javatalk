import java.util.*;
import java.sql.*;
import java.io.Console;
class Project
{
	static String name,username,HomeTown,CurrentCity,Education,Password,dob,Contact_Info,Gender,Id,Pswrd,pswrd,fr;
	static Scanner sc=new Scanner(System.in);
	static Connection con;
	static
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
	static void Front()
	{
		cls();
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		for(int i=1;i<=101;i++)
		System.out.print("=");
		System.out.print("\n");

		for(int j=1;j<=3;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=99;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}

		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=28;i++)
		System.out.print(" ");
		for(int i=1;i<=20;i++)
		System.out.print("-.");
		for(int i=1;i<=31;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=28;i++)
		System.out.print(" ");
		for(int i=1;i<=20;i++)
		System.out.print("-.");
		for(int i=1;i<=31;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");

		for(int j=1;j<=10;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=47;i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=49;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}

		for(int i=1;i<=29;i++)     //yaha se shuru kro comment
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=47;i++)
		System.out.print(" ");
		for(int i=1;i<=26;i++)
		System.out.print("_");
		for(int i=1;i<=26;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=47;i++)
		System.out.print(" ");
		for(int i=1;i<=26;i++)
		System.out.print(".");
		for(int i=1;i<=26;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=47;i++)
		System.out.print(" ");
		for(int i=1;i<=26;i++)
		System.out.print("_");
		for(int i=1;i<=26;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
			for(int j=1;j<=10;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=47;i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=9;i++)
		System.out.print(" ");
		System.out.print("!-!");
		for(int i=1;i<=37;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}
		for(int j=1;j<=5;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=23;i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=21;i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=9;i++)
		System.out.print(" ");
		System.out.print("!-!");
		for(int i=1;i<=37;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}

		for(int k=0;k<=5;k++){
		for(int j=1;j<=1;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=24+k;i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=(19-2*k);i++)
		System.out.print(" ");
		System.out.print("-.-");
		for(int i=1;i<=50+k;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}}
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=30;i++)
		System.out.print(" ");
		for(int i=1;i<=6;i++)
		System.out.print("-.");
		for(int i=1;i<=57;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");

		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=99;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=50;i++)
		System.out.print(" ");
		System.out.print("...JAVA TALK");
		for(int i=1;i<=37;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=49;i++)
		System.out.print(" ");
		System.out.print("....Developed by HARSH SAINI & JAY KISHAN");
		for(int i=1;i<=9;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		for(int j=1;j<=3;j++){
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		System.out.print("@");
		for(int i=1;i<=99;i++)
		System.out.print(" ");
		System.out.print("@");
		System.out.print("\n");
		}
		for(int i=1;i<=29;i++)
		System.out.print(" ");
		for(int i=1;i<=101;i++)
		System.out.print("=");
		System.out.print("\n");
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("\t\t\t     Ctrl+C at any stage will take you out of \"JAVATALK\"...");
		System.out.print("\t\t\t     Press Enter key to continue...");
		sc.nextLine();
		cls();
		login();
		}
		catch(Exception e)
		{
			cls();
		}
		
	}
	public static void cls()
	{
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e){}
	}
	static void login() throws Exception
	{
		for(int i=1;i<=3;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t!!!!!!!!!!!!!!!!!!\tWELCOME TO JAVATALK\t!!!!!!!!!!!!!!!!!!");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t");
		for(int i=1;i<=80;i++)
			System.out.print("_");
		for(int i=1;i<=8;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t -->Please the choose the option: ");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t");
		for(int i=1;i<=80;i++)
			System.out.print("_");
		for(int i=1;i<=3;i++)
			System.out.println("\n");
		System.out.println("          \t\t\t \t                  1) Login                       2) SignUp");
		System.out.println("\n");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t");
		for(int i=1;i<=80;i++)
			System.out.print("_");
		System.out.println("\n");
		System.out.print("\t\t\t\t\t");
		boolean b=true;
		int n=0;
		while(b){
		try{
			n=sc.nextInt();
			b=false;
			sc.nextLine();
			cls();
		}
		catch(Exception e)
		{
			cls();
			System.out.println("\n");
			System.out.print("\t\t\t\t\tOOPS.... Something went wrong....Please Try again...");
			sc.nextLine();
			login();
		}
		}
		switch(n)
		{
			case 1:
			boolean l=true;
			while(l)
			{
				for(int i=1;i<=6;i++)
					System.out.println("\n");
				System.out.println("\t\t\t\t\t\t\t\t!!!!\tLogin\t!!!! ");
				System.out.print("\t\t\t\t\t\t\t\t");
				for(int i=1;i<=20;i++)
					System.out.print("_");
				for(int i=1;i<=5;i++)
					System.out.println("\n");
				System.out.print("\t\t\t\t\tEnter Username :");
				System.out.print("\t");
				Id=sc.nextLine();
				fr=Id;
				System.out.println("\n");
				System.out.println("\t\t\t\t\tPress 's' to enter Hidden Password....else press any other key to enter Visible Password");
				System.out.print("\t\t\t\t\t");
				String st=sc.nextLine();
				String s12="s";
				pswrd="";
				if((st.compareTo(s12))==0)
				{
				System.out.print("\t\t\t\t\tEnter Password :");
				System.out.print("\t");
				Console cns=System.console();
				char[] ch=cns.readPassword();
				pswrd=String.valueOf(ch);
				System.out.println("\n");
				}
				else
				{
				System.out.print("\t\t\t\t\tEnter Password :");
				System.out.print("\t");
				pswrd=sc.nextLine();
				System.out.println("\n");
				}
				login1();
		}




			break;
			case 2:
			boolean h=true;
			boolean o=true;
			while(o)
		{
			while(h)
			{
			
			for(int i=1;i<=6;i++)
			System.out.println("\n");
			System.out.println("\t\t\t\t\t\t\t\t!!!!\tSignUp\t!!!! ");
			System.out.print("\t\t\t\t\t\t\t");
			for(int i=1;i<=36;i++)
				System.out.print("_");
			for(int i=1;i<=5;i++)
				System.out.println("\n");
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t | \t\tEnter Username      \t|");
			System.out.print("\t");
			username=sc.nextLine();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t | \t\tEnter Name         \t|");
			System.out.print("\t");
			name=sc.nextLine();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t | \t\tSet Password(min 6)\t|");
			System.out.print("\t");
			Password=sc.nextLine();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t | \t\tEnter DOB(dd/mm/yyyy)\t|");
			System.out.print("\t");
			dob=sc.nextLine();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t | \t\tEnter Contact info   \t|");
			System.out.print("\t");
			Contact_Info=sc.nextLine();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.println("\t\t\t\t | \t\tChoose your Gender      |");
			System.out.println("\t\t\t\t | \t\t1) Male                 |");
			System.out.println("\t\t\t\t | \t\t2) Female               |");
			System.out.print("\t\t\t\t | \t\t3) Others               |");
			System.out.print("\t");
			try{
			int m=sc.nextInt();
			System.out.print("\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			if(m==1){
			Gender="Male";
				h=false;}
			else if(m==2){
			Gender="Female";
				h=false;}
			else if(m==3){
			Gender="Others";
			h=false;}
			else{
				System.out.println("\t\t\t\t\t Please enter a valid choice...");
			cls();
			sc.nextLine();
			}
			}
			catch(Exception e){
				cls();
				System.out.println("\t\t\t\t\t  OOPS......Something went wrong....Please try again...");
				sc.nextLine();
				}
		}
			h=true;
			System.out.println("\n");
			PreparedStatement pst=con.prepareStatement("select * from menu1 where username=?");
			pst.setString(1,username);
			ResultSet rs=pst.executeQuery();
			o=false;
			if(rs.next())
			{
				cls();
				System.out.print("\n");
				System.out.print("\t\t\t\t\tSorry...This UserName already exists...Please choose your unique UserName....");
				o=true;
				sc.nextLine();
			}
			
		}
			if(Password.length()>=6)
			{
			PreparedStatement pst=con.prepareStatement("insert into menu1 (username,name,Password,dob,Contact_Info,Gender) values (?,?,?,?,?,?)");
			pst.setString(1,username);
			pst.setString(2,name);
			pst.setString(3,Password);
			pst.setString(4,dob);
			pst.setString(5,Contact_Info);
			pst.setString(6,Gender);
			if(pst.executeUpdate()>0)
			{
				System.out.println("\t\t\t\t\tCongratulations........You are Successfully signed up");
				sc.nextLine();
				sc.nextLine();
				cls();
				login();
			}
			else{
				cls();
			System.out.println("\t\t\t\t\tSign up failed....");
			login();
			}
			}
			else{
				cls();
			System.out.println("\t\t\t\t\tSign up failed....Password must be of atleast 6 characters...");
			login();
			}
			break;
			default:
			cls();
			System.out.print("\n");
			System.out.println("\t\t\t\t\tPlease enter a valid choice ");
			login();

		}
	}
	public static void login1() throws Exception
	{
		PreparedStatement pst=con.prepareStatement("select * from menu1 where username=? and Password=?");
				pst.setString(1,Id);
				pst.setString(2,pswrd);
				ResultSet rs=pst.executeQuery();
			if(rs.next())
				{
					cls();
					boolean l=false;
					boolean k=true;
					while(k)
					{
					String name=rs.getString("name");
					int a=name.length();
					for(int i=1;i<=6;i++)
					System.out.println("\n");
					System.out.println("\t\t\t\t\t\t\t\t!!!!\tWelcome "+name+"\t!!!! ");
					System.out.print("\t\t\t\t\t\t\t\t");
					for(int i=1;i<=(24+a);i++)
						System.out.print("_");
					for(int i=1;i<=4;i++)
						System.out.println("\n");
					System.out.print("\t\t\t\t\t  ");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("\n");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print(" ");
					System.out.print("|");
					System.out.print("\n");

					System.out.println("\t\t\t\t\t |\t\t\t\t1) View Profile\t\t\t\t\t| ");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t2) Edit Profile\t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t3) Explore     \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t4) Requests    \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t5) Friends     \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t6) Chats       \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t7) Delete Id   \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");
					System.out.println("\t\t\t\t\t |\t\t\t\t8) Log Out   \t\t\t\t\t|");
					System.out.print("\t\t\t\t\t |");
					for(int i=1;i<=78;i++)
						System.out.print("_");
					System.out.print("|");
					System.out.print("\n");

					try
					{
						System.out.print("\t\t\t\t\t ");
						System.out.print("Please choose : ");
						int t=sc.nextInt();
						switch(t)
						{
							case 8:
							cls();
							k=false;
							login();
							break;
							case 7:
							k=false;
							System.out.println("\t\t\t\t\t Are You Sure to delete your account permanently?");
							System.out.print("\t\t\t\t\t YES\\NO\t\t");
							sc.nextLine();
							String g=sc.nextLine();
							String k2="YES";
							String k1="NO";
							if(g.compareToIgnoreCase(k2)==0)
							{
							pst=con.prepareStatement("delete from menu1 where username=?");
							pst.setString(1,Id);
							PreparedStatement pst1=con.prepareStatement("delete from menu2 where username1=?");
							pst1.setString(1,Id);
							if(pst.executeUpdate()>0 && pst1.executeUpdate()>0){
							
							System.out.println("\t\t\t\t\t Account deleted successfully...Thanks for using 'JAVATALK' :-)");
							cls();
							
							Front();
							}
							}
							else if(g.compareToIgnoreCase(k1)==0)
							{
								login1();
							}
							else{
								System.out.println("\t\t\t\t\t Please Enter a valid choice...");
							}
							break;
							case 1:
							k=false;
							cls();
							ViewProfile();
							break;
							case 2:
							k=false;
							cls();
							UpdateProfile();
							break;
							case 3:
							k=false;
							cls();
							explore();
							break;
							case 4:
							k=false;
							cls();
							request();
							break;
							case 5:
							k=false;
							cls();
							friends();
							break;
							case 6:
							k=false;
							cls();
							chat();
							break;



						}

					}
					catch(InputMismatchException e)
					{
					cls();
					System.out.println("\t\t\t\t\t  OOPS......Something went wrong....Please try again...");
					sc.nextLine();
					}
					}
				}
					else
				{
					cls();
					for(int i=1;i<=2;i++)
					System.out.println("\n");
					System.out.println("\t\t\t\t\tInvalid username or Password.....Please try again");
				}

	}
	public static void UpdateProfile() throws Exception
	{
		for(int i=1;i<=6;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\tUpdate_Profile\t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		for(int i=1;i<=27;i++)
			System.out.print("_");
		for(int i=1;i<=5;i++)
			System.out.println("\n");
		PreparedStatement pst=con.prepareStatement("select * from menu1 where username=?");
		pst.setString(1,Id);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			System.out.print("\n");
			System.out.print("\t\t\t\t\t  ");
			for(int i=1;i<=79;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");

			System.out.println("\t\t\t\t\t |\t\t\t\t1) User_Name   \t\t\t\t\t| ");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
		System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t2) Home_Town   \t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
		System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t3) Current_City\t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
		System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t4) Contact_Info\t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
		System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t5) Occupation  \t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
		System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t6) Education   \t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t7) Relationship\t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t8) Hobbies     \t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t9) Bio         \t\t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t10) Log Out     \t\t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.println("\t\t\t\t\t |\t\t\t\t11) Previous Menu       \t\t\t|");
			System.out.print("\t\t\t\t\t |");
			for(int i=1;i<=78;i++)
			System.out.print("_");
			System.out.print("|");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t Please enter the field you want to update\t");
			boolean b=true;
			boolean c=true;
			int m=0;
			while(b){
				while(c){
			try{
			 m=sc.nextInt();
			 b=false;
			if(m==1)
			{
				System.out.print("\t\t\t\t\t Enter new Name\t");
				sc.nextLine();
				String Name=sc.nextLine();
				pst=con.prepareStatement("update menu1 set name=? where username=?");
				pst.setString(1,Name);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Name Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\tSomething went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==2)
			{
				System.out.print("\t\t\t\t\t Enter Home_Town\t");
				sc.nextLine();
				String ht=sc.nextLine();
				pst=con.prepareStatement("update menu1 set HomeTown=? where username=?");
				pst.setString(1,ht);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Home_Town Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==3)
			{
				System.out.print("\t\t\t\t\t Enter Current_City\t");
				sc.nextLine();
				String city=sc.nextLine();
				pst=con.prepareStatement("update menu1 set CurrentCity=? where username=?");
				pst.setString(1,city);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Current city details Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==4)
			{
				System.out.print("\t\t\t\t\t Enter Contact_Info\t");
				sc.nextLine();
				String contact=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Contact_Info=? where username=?");
				pst.setString(1,contact);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Contact_Info Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==5)
			{
				System.out.print("\t\t\t\t\t Enter Occupation\t");
				sc.nextLine();
				String occupation=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Occupation=? where username=?");
				pst.setString(1,occupation);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Occupation Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==6)
			{
				System.out.print("\t\t\t\t\t Enter Education details...\t");
				sc.nextLine();
				String edu=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Education=? where username=?");
				pst.setString(1,edu);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Education details Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==7)
			{
				System.out.print("\t\t\t\t\t Enter Relationship status...\t");
				sc.nextLine();
				String rel=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Relationship=? where username=?");
				pst.setString(1,rel);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Relationship status Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==8)
			{
				System.out.print("\t\t\t\t\t Enter Hobbies that you want to add...\t");
				sc.nextLine();
				String hob=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Hobbies=? where username=?");
				pst.setString(1,hob);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Hobbies Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==9)
			{
				System.out.print("\t\t\t\t\t Write Something about yourself...\t");
				sc.nextLine();
				String bio=sc.nextLine();
				pst=con.prepareStatement("update menu1 set Bio=? where username=?");
				pst.setString(1,bio);
				pst.setString(2,Id);
				if(pst.executeUpdate()>0)
				{
					System.out.println("\t\t\t\t\t Bio Updated Successfully....");
				}
				else{
				System.out.println("\t\t\t\t\t Something went wrong...");
				}
				c=false;
				System.out.println("\t\t\t\t\t Please press 'u' to continue.....else press any key to go back to previous page...");
				String s=sc.nextLine();
				String s1="u";
				if(s.compareTo(s1)==0)
				{
					cls();
				UpdateProfile();}
			else
				login1();
			}
			else if(m==10)
			{
				cls();
				login();
			}
			else if(m==11)
			{
				cls();
				login1();
			}
			else{
				cls();
				System.out.println("\n");
				System.out.println("\t\t\t\t\t Please Enter a valid option...");
				UpdateProfile();
			}
			}
			catch(Exception e)
			{
				cls();
				System.out.println("\n");
				sc.nextLine();
				System.out.println("\t\t\t\t\t Please enter a valid entry....");
				UpdateProfile();
			}
			}
			}
		}
	}
	public static void ViewProfile() throws Exception
	{
		boolean b=true;
		while(b)
	{
		for(int i=1;i<=3;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\tProfile\t  !!!! ");
		System.out.print("\t\t\t\t\t\t\t");
		for(int i=1;i<=38;i++)
			System.out.print("_");
		for(int i=1;i<=3;i++)
			System.out.println("\n");
		PreparedStatement pst=con.prepareStatement("select * from menu1 where username=?");
		pst.setString(1,Id);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.print("\t\t\t\t\t ");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String name=rs.getString("name");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Name        \t:\t "+name);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String ht=rs.getString("HomeTown");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* HomeTown    \t:\t "+ht);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String cc=rs.getString("CurrentCity");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Current City\t: \t "+cc);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String edu=rs.getString("Education");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Education   \t: \t "+edu);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String gender=rs.getString("Gender");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Gender      \t: \t "+gender);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String occ=rs.getString("Occupation");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Working as  \t:  \t"+occ);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String contact=rs.getString("Contact_Info");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Contact     \t: \t "+contact);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String dob=rs.getString("dob");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* DOB         \t: \t "+dob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String bio=rs.getString("Bio");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Bio         \t: \t "+bio);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String rel=rs.getString("Relationship");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Relationship\t: \t "+rel);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String hob=rs.getString("Hobbies");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Hobbies     \t: \t "+hob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(int i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			System.out.print("\t\t\t\t\t");
			System.out.println("Please choose");
			System.out.print("\t\t\t\t\t");
			System.out.println("1) Back to Previous Page");
			System.out.print("\t\t\t\t\t");
			System.out.println("2) Log Out");
			System.out.print("\t\t\t\t\t");
			try
			{
				int k=sc.nextInt();
				switch(k)
				{
					case 1:
					b=false;
					cls();
					login1();

					break;
					case 2:
					b=false;
					cls();
					login();
					break;
					default :
					cls();
					System.out.println("\n");
					System.out.println("\t\t\t\t\t  Enter valid choice...");
					
				}
			}
			catch(Exception e)
			{
				cls();
				System.out.println("\n");
				System.out.println("\t\t\t\t\t  OOPS......Something went wrong....Please try again...");
				sc.nextLine();
			}
		}

	}
	}





	//Harsh








    public static void explore() throws Exception{
        // Displays the username and name of all people;
      int i=1,o=0,m=0,n=1,z=0;
      String frw=new String("");
      PreparedStatement pst=con.prepareStatement("select username,name from menu1");
      ResultSet rs=pst.executeQuery();
	  
		for(i=1;i<=6;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t    Explore    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		for(i=1;i<=28;i++)
			System.out.print("_");
		for(i=1;i<=5;i++)
			System.out.println("\n");
		System.out.print("\n");
		
		
			System.out.print("\t\t\t\t\t ");
			for(i=1;i<=77;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
			for(i=1;i<=77;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
	  
			//System.out.println("\t\t\t\t\t \t\tS.No.\t\t\tUser ID   \t\tName");
			System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.No","|","User ID","|","Name","|");
			System.out.print("\n\t\t\t\t\t ");
			for(i=1;i<=77;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			while(rs.next()){
				if(rs.getString(1).equals(fr))
				continue;
				//System.out.println("\t\t\t\t\t \t\t"+n+"\t\t\t"+rs.getString(1)+"   \t\t"+rs.getString(2));
				System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",n,"|",rs.getString(1),"|",rs.getString(2),"|");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=77;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
				z++;
				n++;
			}

			System.out.print("\n");
			System.out.print("\n");
			
			System.out.println("\t\t\t\t\t \t\t"+(++z)+")\t"+"Previous Menu");
			if(z==0){
				System.out.println("\t\t\t\t\t  No one in the list!!!");
				System.out.print("\t\t\t\t\t  Press enter key to continue....");
				sc.nextLine();
				login1();
			}
      PreparedStatement pst3=con.prepareStatement("select status1,status2 from menu2 where username1='"+fr+"' and username2='"+frw+"'");
        ResultSet rs1=pst3.executeQuery();
        while(rs1.next()){
          if(rs1.getString(1).equals("false") && rs1.getString(2).equals("false"))
          m=0;
          else
          m++;
          if(m==0){
      while(rs.next()){
        System.out.println(i+"\t"+rs.getString(1)+"\t"+rs.getString(2));    //here we will use one if statement whose work will be not to show the self details name
        i++;
      }}
      else
      System.out.println("\t\t\t\t\t  Already friend!!!");
			System.out.println("\t\t\t\t\t  Press enter to continue...");
			sc.nextLine();
			cls();
			explore();
      }



		sc.nextLine();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t  Enter UserId to send friend request.... else press "+z+" for Previous Menu\t");
		frw=sc.nextLine();
			Integer y=new Integer(z);
			String s=y.toString();
			if(s.equals(frw))
			login1();

      // in main project it will be already entered
      pst=con.prepareStatement("select username from menu1");
      rs=pst.executeQuery();

      while(rs.next()){
        if(frw.equals(rs.getString(1)))
        o++;
      }
      if(o==0)
        {
					System.out.println("\t\t\t\t\t  Username not found");
				System.out.println("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				cls();
				explore();
			}
      else{
        pst3=con.prepareStatement("select status1,status2 from menu2 where username1='"+fr+"' and username2='"+frw+"'");
          rs1=pst3.executeQuery();
          while(rs1.next()){
            if(rs1.getString(1).equals("false") && rs1.getString(2).equals("false"))
            m=0;
            else
            m++;
          }
          if(m==0){
        PreparedStatement pst1=con.prepareStatement("insert into menu2 values(?,?,?,?,?,?)");
        pst1.setString(1,fr);
        pst1.setString(2,frw);
        pst1.setString(3,"false");
        pst1.setString(4,"true");
        pst1.setString(5,"false");
        pst1.setString(6,"");
        PreparedStatement pst2=con.prepareStatement("insert into menu2 values(?,?,?,?,?,?)");
        pst2.setString(1,frw);
        pst2.setString(2,fr);
        pst2.setString(3,"false");
        pst2.setString(4,"false");
        pst2.setString(5,"false");
        pst2.setString(6,"");
        if(pst1.executeUpdate()>0 && pst2.executeUpdate()>0){
          System.out.println("\t\t\t\t\t  Request sent.....");
          System.out.println("\t\t\t\t\t  Press enter to continue....");
          sc.nextLine();
          cls();
          explore();
        }
        else{
          System.out.println("\t\t\t\t\t  Request not sent.....");
          System.out.println("\t\t\t\t\t  Press enter to continue....");
          sc.nextLine();
         cls();
          explore();
        }
        }
        else{
          System.out.println("\t\t\t\t\t  Already sent or Already friend...");
					System.out.println("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					cls();
					explore();
        }
      }
    }         //isme abhi back menu pr jaane ka button bnana hai
    public static void request() throws Exception{
      int o=0,z=1,i=1;

      //List of all the persons
      cls();
      sc.nextLine();
	  for(i=1;i<=6;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Requests    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		for(i=1;i<=28;i++)
			System.out.print("_");
		for(i=1;i<=5;i++)
			System.out.println("\n");
		System.out.print("\n");
		
		
			System.out.print("\t\t\t\t\t ");
			for(i=1;i<=77;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
			for(i=1;i<=77;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
	  
	  
	  
			System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.No","|","User ID","|","Name","|");
			System.out.print("\n\t\t\t\t\t ");
			for(i=1;i<=77;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
      PreparedStatement pst=con.prepareStatement("select status1,status2,username2 from menu2 where username1='"+fr+"'");     //yha aur fields jodni hai
      ResultSet rs=pst.executeQuery();
      while(rs.next()){
        o++;
        if(rs.getString(1).equals("false") && rs.getString(2).equals("false"))
        {
          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(3)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
         System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",z,"|",rs1.getString(1),"|",rs1.getString(2),"|");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=77;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
					z++;
        }}
      }
			System.out.print("\n");
			System.out.print("\n");
			
			System.out.println("\t\t\t\t\t \t\t"+z+")\t"+"Previous Menu");
      //if(o==0)
      //System.out.println("User name not found");
			o=0;
			System.out.println("\n");
			System.out.println("\n");
      System.out.println("\t\t\t\t\t  Type the user ID of the corresponding to get more details else press "+z+" to go previous menu");
	  System.out.print("\t\t\t\t\t  ");
      String user=sc.nextLine();
			Integer y=new Integer(z);
			String s=y.toString();
			if(s.equals(user))
			login1();
      PreparedStatement pst1=con.prepareStatement("select username from menu1 where username='"+user+"'");
      ResultSet rs1=pst1.executeQuery();
      if(rs1.next())
      {
        requestsubmenu(user,fr);
      }
			else{
				System.out.println("\t\t\t\t\t  Username not found!!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				request();
			}

    }
    public static void requestsubmenu(String user, String fr1) throws Exception{
			cls();
			int i=1;
			for(i=1;i<=6;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Select Choice    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		for(i=1;i<=33;i++)
			System.out.print("_");
		for(i=1;i<=5;i++)
			System.out.println("\n");
		System.out.print("\n");
		
		
			System.out.print("\t\t\t\t\t ");
			for(i=1;i<=98;i++)
			System.out.print("-");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
      System.out.println("\t\t\t\t\t  1 for profile      \t\t\t\t\t  |");
	  System.out.print("\t\t\t\t\t ");
			for(i=1;i<=98;i++)
			System.out.print("-");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
      System.out.println("\t\t\t\t\t  2 for accept       \t\t\t\t\t  |");
	   System.out.print("\t\t\t\t\t ");
			for(i=1;i<=98;i++)
			System.out.print("-");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
      System.out.println("\t\t\t\t\t  3 for decline      \t\t\t\t\t  |");
	   System.out.print("\t\t\t\t\t ");
			for(i=1;i<=98;i++)
			System.out.print("-");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
      System.out.println("\t\t\t\t\t  4 for previous menu\t\t\t\t\t  |");
	   System.out.print("\t\t\t\t\t ");
			for(i=1;i<=98;i++)
			System.out.print("-");
		System.out.print("\n");
		System.out.print("\n");
			int op=0;
        try{
			System.out.print("\t\t\t\t\t  ");
			op=sc.nextInt();}
				catch(Exception e){
					System.out.println("\t\t\t\t\t  Incorrect input!!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					requestsubmenu(user,fr1);
				}
				if(op>4)
				{
					System.out.println("\t\t\t\t\t  Incorrect input!!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					requestsubmenu(user,fr1);
				}
        PreparedStatement pst1=con.prepareStatement("select * from menu1 where username='"+user+"'");
        ResultSet rs1=pst1.executeQuery();
        switch(op){

          case 1 : cls();
          while(rs1.next()){
          /*  System.out.println(rs1.getString(1));													//YHA PR DETAILS PRINT KARANI HAI
						System.out.println(rs1.getString(2));
						System.out.println(rs1.getString(3));
						System.out.println(rs1.getString(4));
						System.out.println(rs1.getString(5));
						System.out.println(rs1.getString(6));
						System.out.println(rs1.getString(7));
						System.out.println(rs1.getString(8));
						System.out.println(rs1.getString(10));
						System.out.println(rs1.getString(11));
						System.out.println(rs1.getString(12));
						System.out.println(rs1.getString(13));*/
									boolean b=true;
		while(b)
	{
		for(i=1;i<=3;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\tProfile\t  !!!! ");
		System.out.print("\t\t\t\t\t\t\t");
		for(i=1;i<=38;i++)
			System.out.print("_");
		for(i=1;i<=3;i++)
			System.out.println("\n");
		PreparedStatement pst=con.prepareStatement("select * from menu1 where username=?");
		pst.setString(1,user);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.print("\t\t\t\t\t ");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String name=rs.getString("name");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Name        \t:\t "+name);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String ht=rs.getString("HomeTown");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* HomeTown    \t:\t "+ht);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String cc=rs.getString("CurrentCity");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Current City\t: \t "+cc);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String edu=rs.getString("Education");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Education   \t: \t "+edu);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String gender=rs.getString("Gender");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Gender      \t: \t "+gender);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String occ=rs.getString("Occupation");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Working as  \t:  \t"+occ);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String contact=rs.getString("Contact_Info");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Contact     \t: \t "+contact);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String dob=rs.getString("dob");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* DOB         \t: \t "+dob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String bio=rs.getString("Bio");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Bio         \t: \t "+bio);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String rel=rs.getString("Relationship");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Relationship\t: \t "+rel);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String hob=rs.getString("Hobbies");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Hobbies     \t: \t "+hob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			System.out.print("\t\t\t\t\t");
			System.out.println("Please choose");
			System.out.print("\t\t\t\t\t");
			System.out.println("1) Back to Previous Page");
			System.out.print("\t\t\t\t\t");
			System.out.println("2) Log Out");
			System.out.print("\t\t\t\t\t");
			try
			{
				int k=sc.nextInt();
				switch(k)
				{
					case 1:
					b=false;
					cls();
					request();

					break;
					case 2:
					b=false;
					cls();
					login();
					break;
					default :
					cls();
					System.out.println("\n");
					System.out.println("\t\t\t\t\t  Enter valid choice...");
					
				}
			}
			catch(Exception e)
			{
				cls();
				System.out.println("\n");
				System.out.println("\t\t\t\t\t  OOPS......Something went wrong....Please try again...");
				sc.nextLine();
			}
		

	}
          }
          }//////////////////////////////////////////////////////////////////////
					sc.nextLine();
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					requestsubmenu(user,fr1);
          break;
          case 2 :
          while(rs1.next()){
            PreparedStatement pst=con.prepareStatement("update menu2 set status1='true',status2='true' where username1='"+user+"' and username2='"+fr1+"'");
            PreparedStatement pst2=con.prepareStatement("update menu2 set status1='true',status2='true' where username1='"+fr1+"' and username2='"+user+"'");
            if(pst.executeUpdate()>0 && pst2.executeUpdate()>0)
            System.out.println("\t\t\t\t\t  You are now friends!!");
						System.out.print("\t\t\t\t\t  Press enter to continue.....");
						sc.nextLine();
						sc.nextLine();
						request();
          }
          break;
          case 3 :
          while(rs1.next()){
            PreparedStatement pst=con.prepareStatement("delete from menu2 where username1='"+user+"' and username2='"+fr1+"'");
            PreparedStatement pst2=con.prepareStatement("delete from menu2 where username1='"+fr1+"' and username2='"+user+"'");
            if(pst.executeUpdate()>0 && pst2.executeUpdate()>0)
				System.out.print("\n\t\t\t\t\t ");
            System.out.print("Request cancelled!!");
						System.out.print("\t\t\t\t\t  Press enter to continue...");
						sc.nextLine();
						sc.nextLine();
						request();
          }
          break;
          case 4 : request();
          break;
        }
    }
    public static void friends() throws Exception{
			cls();
      int o=0,z=1,t=0,i=1;
      sc.nextLine();
	  for(i=1;i<=6;i++)
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Friends    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
	for(i=1;i<=28;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=77;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=77;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
	  
	  
	  
			System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.No","|","User ID","|","Name","|");
			System.out.print("\n\t\t\t\t\t ");
			for(i=1;i<=77;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
      PreparedStatement pst=con.prepareStatement("select status1,username2 from menu2 where username1='"+fr+"'");
      ResultSet rs=pst.executeQuery();
      while(rs.next()){
        if(rs.getString(1).equals("true")){
          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(2)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
            System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",z,"|",rs1.getString(1),"|",rs1.getString(2),"|");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=77;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
            o++;
						z++;
          }
        }
      }
      if(o==0)
      System.out.println("\t\t\t\t\t  No friends");

      System.out.println("\t\t\t\t\t  1 for editing friendlist");
      System.out.println("\t\t\t\t\t  2 for previous menu");
	  System.out.print("\t\t\t\t\t  ");
      try{o=sc.nextInt();}
			catch(Exception e){
				System.out.println("\t\t\t\t\t  Incorrect input!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				sc.nextLine();
				friends();
			}
			if(o>2){
				System.out.println("\t\t\t\t\t  Incorrect input!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				sc.nextLine();
				friends();
			}
      switch(o){
        case 1 :
        System.out.print("\t\t\t\t\t  Enter the username : ");
        sc.nextLine();
        String frw=sc.nextLine();

        PreparedStatement pst4=con.prepareStatement("select status2 from menu2 where username1='"+frw+"' and username2='"+fr+"'");
        ResultSet rs2=pst4.executeQuery();
        while(rs2.next()){t++;
        if(rs2.getString(1).equals("true")){
          friendssubmenu(frw);
        }
        else{
          System.out.println("\t\t\t\t\t  You are unfollowed!!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					friends();
        }
      }
			if(t==0){
				System.out.println("\t\t\t\t\t  Invalid input!!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				friends();
			}
        break;
        case 2 : login1();                                            //yha pr main menu pr jaane ke liye method call krna hai
        break;
      }

    }
    public static void friendssubmenu(String frw) throws Exception{
			cls();
			int i=0,z=1;
			for(i=1;i<=6;i++)
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Select any option :    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
	for(i=1;i<=41;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
      System.out.println("\t\t\t\t\t|\t\t1 \t|\tView profile \t\t\t\t     |");
      System.out.println("\t\t\t\t\t|\t\t2 \t|\tUnfollow     \t\t\t\t     |");
      System.out.println("\t\t\t\t\t|\t\t3 \t|\tUnfriend     \t\t\t\t     |");
      System.out.println("\t\t\t\t\t|\t\t4 \t|\tPrevious menu\t\t\t\t     |");
	  System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
		System.out.print("_");
	System.out.print("|");
	System.out.print("\n");
	  System.out.print("\t\t\t\t\t  ");
        try{i=sc.nextInt();}
				catch(Exception e){
					System.out.println("\t\t\t\t\t  Incorrect input!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					friendssubmenu(frw);
				}
				if(i>4)
				{
					System.out.println("\t\t\t\t\t  Incorrect input!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					friendssubmenu(frw);
				}
        switch(i){
          case 1 :
          //PreparedStatement pst4=con.prepareStatement("select status2 from menu2 where username1='"+frw+"' and username2='"+fr+"'");
          /*ResultSet rs2=pst4.executeQuery();
          if(rs2.getString(1).equals("true")){*/
          //PreparedStatement pst=con.prepareStatement("select *  from menu1 where username='"+frw+"'");
          //ResultSet rs=pst.executeQuery();
         // while(rs.next()){
			boolean b=true;
		while(b)
	{
		for(i=1;i<=3;i++)
			System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\tProfile\t  !!!! ");
		System.out.print("\t\t\t\t\t\t\t");
		for(i=1;i<=38;i++)
			System.out.print("_");
		for(i=1;i<=3;i++)
			System.out.println("\n");
		PreparedStatement pst=con.prepareStatement("select * from menu1 where username=?");
		pst.setString(1,frw);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.print("\t\t\t\t\t ");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String name=rs.getString("name");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Name        \t:\t "+name);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			String ht=rs.getString("HomeTown");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* HomeTown    \t:\t "+ht);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String cc=rs.getString("CurrentCity");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Current City\t: \t "+cc);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String edu=rs.getString("Education");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Education   \t: \t "+edu);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String gender=rs.getString("Gender");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Gender      \t: \t "+gender);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String occ=rs.getString("Occupation");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Working as  \t:  \t"+occ);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String contact=rs.getString("Contact_Info");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Contact     \t: \t "+contact);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String dob=rs.getString("dob");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* DOB         \t: \t "+dob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String bio=rs.getString("Bio");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Bio         \t: \t "+bio);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String rel=rs.getString("Relationship");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Relationship\t: \t "+rel);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			String hob=rs.getString("Hobbies");
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			System.out.print("\t\t\t");
			System.out.println("* Hobbies     \t: \t "+hob);
			System.out.print("\t\t\t\t\t");
			System.out.print("|");
			for(i=1;i<=100;i++)
				System.out.print("_");
			System.out.println("\n");
			System.out.print("\t\t\t\t\t");
			System.out.println("Please choose");
			System.out.print("\t\t\t\t\t");
			System.out.println("1) Back to Previous Page");
			System.out.print("\t\t\t\t\t");
			System.out.println("2) Log Out");
			System.out.print("\t\t\t\t\t");
			try
			{
				int k=sc.nextInt();
				switch(k)
				{
					case 1:
					b=false;
					cls();
					friends();

					break;
					case 2:
					b=false;
					cls();
					login();
					break;
					default :
					cls();
					System.out.println("\n");
					System.out.println("\t\t\t\t\t  Enter valid choice...");
					
				}
			}
			catch(Exception e)
			{
				cls();
				System.out.println("\n");
				System.out.println("\t\t\t\t\t  OOPS......Something went wrong....Please try again...");
				sc.nextLine();
			}
		

	}
          }
      /*  }
        else{
          System.out.println("You are unfollowed!!!");
        }*/
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				sc.nextLine();
				friendssubmenu(frw);
          break;
          case 2 :
          PreparedStatement pst3=con.prepareStatement("update menu2 set status2='false' where username1='"+fr+"' and username2='"+frw+"'");
          if(pst3.executeUpdate()>0)
          System.out.println("\t\t\t\t\t  Unfollowed!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					friendssubmenu(frw);
          break;
          case 3 :
          PreparedStatement pst2=con.prepareStatement("delete from menu2 where username1='"+fr+"' and username2='"+frw+"'");
          PreparedStatement pst1=con.prepareStatement("delete from menu2 where username1='"+frw+"' and username2='"+fr+"'");
          if(pst2.executeUpdate()>0 && pst1.executeUpdate()>0)
          System.out.println("\t\t\t\t\t  Unfriend successfully!!");
					System.out.print("\t\t\t\t\t  Press enter to continue...");
					sc.nextLine();
					sc.nextLine();
					friendssubmenu(frw);
          break;
          case 4 : friends();
          break;
        }

    }
   public static void chat() throws Exception{
			int op=0,i=1;
			cls();
      for(i=1;i<=6;i++)
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Chat    \t!!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
	for(i=1;i<=26;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
		
      System.out.println("\t\t\t\t\t|\t\t\t1 Talk to new friend\t\t\t\t     |");
      System.out.println("\t\t\t\t\t|\t\t\t2 Recent chat       \t\t\t\t     |");
      System.out.println("\t\t\t\t\t|\t\t\t3 Previous menu     \t\t\t\t     |");
System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
			System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");

		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
		
	  System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
		System.out.print("_");
	System.out.print("|");
	System.out.print("\n");
	 System.out.print("\t\t\t\t\t  ");
	System.out.print("Choose any option\t");
      try{op=sc.nextInt();}
			catch(Exception e){
				System.out.println("\t\t\t\t\t  Incorrect input!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				sc.nextLine();
				chat();
			}
			if(op>3){
				System.out.println("\t\t\t\t\t  Incorrect input!!");
				System.out.print("\t\t\t\t\t  Press enter to continue...");
				sc.nextLine();
				sc.nextLine();
				chat();
			}
      switch(op){
        case 1 : newtalk();
        break;
        case 2 : recentchat();
        break;
        case 3 : login1();
        break;
      }

    }
    public static void recentchat() throws Exception{
      int o=0,z=1,i=1,a=0;
			cls();
 sc.nextLine();
	  for(i=1;i<=6;i++)
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Recent Chat     !!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		     
	for(i=1;i<=32;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
			
			
			System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.No","|","User ID","|","Name","|");
			System.out.print("\n\t\t\t\t\t ");
			for(i=1;i<=76;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			
      PreparedStatement pst=con.prepareStatement("select status3,username2 from menu2 where username1='"+fr+"'");
      ResultSet rs=pst.executeQuery();
      
			while(rs.next()){
				a=0;
		PreparedStatement pst2=con.prepareStatement("select status3,username1 from menu2 where username2='"+fr+"'");
		ResultSet rs2=pst2.executeQuery();
        while(rs2.next()){
					if(a!=0)
					continue;
				//a=0;
        if(rs.getString(1).equals("true") || rs2.getString(1).equals("true")){

          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(2)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
						List<String> list=new  ArrayList<String>();
						list.add(rs1.getString(1));
						for(String s : list){
							if(s.equals(rs1.getString(1))){
							//continue;
							a++;}
						}
            System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",z,"|",rs1.getString(1),"|",rs1.getString(2),"|1");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=76;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
            o++;z++;

          }
        }
      }
    }
	/*pst=con.prepareStatement("select status3,username2 from menu2 where username1='"+fr+"'");
      rs=pst.executeQuery();
      pst2=con.prepareStatement("select status3,username1 from menu2 where username2='"+fr+"'");
      rs2=pst2.executeQuery();
	while(rs.next()){
		a=0;

        while(rs2.next()){
					if(a!=0)
					continue;
				//a=0;
        if(rs2.getString(1).equals("true") || rs.getString(1).equals("true")){

          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs2.getString(2)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
						List<String> list=new  ArrayList<String>();
						list.add(rs1.getString(1));
						for(String s : list){
							if(s.equals(rs1.getString(1))){
							//continue;
							a++;}
						}
            System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",z,"|",rs1.getString(1),"|",rs1.getString(2),"|2");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=76;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
            o++;z++;

          }
        }
      }
    }*/
			if(o==0)
  		{
			//System.out.print("\t\t\t\t\t Enter the User ID of the person you want to chat with\t ");
      		////String frw=sc.nextLine();
			//chatscreen(frw);
  		System.out.println("\t\t\t\t\t No friends!!");
  		System.out.print("\t\t\t\t\t Press enter to continue....");
  		sc.nextLine();
  		chat();
				}
				else{
					System.out.println("\n");
					System.out.println("\n");
      		System.out.print("\t\t\t\t\t Enter the User ID of the person you want to chat with\t ");
      		String frw=sc.nextLine();
      		chatscreen(frw);
      		mainchat(fr,frw);
    }
  }
  public static void mainchat(String fr1, String frw1) throws Exception{
		String stm=new String("");
		String stn=new String("");
		String st1=new String("");
		String sts=new String("____ ");

		PreparedStatement pst=con.prepareStatement("select status3 from menu2 where username1='"+fr1+"' and username2='"+frw1+"'");
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			if(rs.getString(1).equals("true")){
				PreparedStatement pst1=con.prepareStatement("select chat from menu2 where username1='"+fr1+"' and username2='"+frw1+"'");
				ResultSet rs1=pst1.executeQuery();
				while(rs1.next()){
				st1=rs1.getString(1);
			}
				String st2=sc.nextLine();
				stn=fr1 + sts + " ";
					stm= st1 + stn + st2;
				PreparedStatement ps2=con.prepareStatement("update menu2 set chat='"+stm+"' where username1='"+fr1+"' and username2='"+frw1+"'");
				if(ps2.executeUpdate()>0){};


			}
			else
			{
				PreparedStatement pst1=con.prepareStatement("select chat from menu2 where username1='"+frw1+"' and username2='"+fr1+"'");
				ResultSet rs1=pst1.executeQuery();
				while(rs1.next()){
				st1=rs1.getString(1);
			}
				String st2=sc.nextLine();
				stn=fr1 + sts + " ";
					stm= st1 + stn + st2;
				PreparedStatement ps2=con.prepareStatement("update menu2 set chat='"+stm+"' where username1='"+frw1+"' and username2='"+fr1+"'");
				if(ps2.executeUpdate()>0){};




			}
		}
		chat();
	}

  public static void newtalk() throws Exception{
      int o=0,l=0,z=1,i=1;
			//cls();
      String frw;
      sc.nextLine();
			cls();
      for(i=1;i<=6;i++)
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   New Friend      !!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
	for(i=1;i<=26;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
	  
	  
	  
			System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|","S.No","|","User ID","|","Name","|");
			System.out.print("\n\t\t\t\t\t ");
			for(i=1;i<=76;i++)
			System.out.print("_");
			System.out.print("\n");
			System.out.print("\n");
			
			
      PreparedStatement pst=con.prepareStatement("select status1,username2 from menu2 where username1='"+fr+"'");
      ResultSet rs=pst.executeQuery();
      while(rs.next()){
        if(rs.getString(1).equals("true")){
          PreparedStatement pst1=con.prepareStatement("select username,name from menu1 where username='"+rs.getString(2)+"'");
          ResultSet rs1=pst1.executeQuery();
          while(rs1.next()){
            System.out.printf("\t\t\t\t\t%-10s%-14s%-10s%-18s%-10s%-16s%-10s","|",z,"|",rs1.getString(1),"|",rs1.getString(2),"|");
				
				System.out.print("\n\t\t\t\t\t ");
				for(i=1;i<=76;i++)
				System.out.print("-");
				System.out.print("\n");
				System.out.print("\n");
            o++;z++;
          }
        }
      }
      if(o==0)
      {
      System.out.println("\t\t\t\t\t No friends");
      System.out.print("\t\t\t\t\t Press enter to continue....");
      sc.nextLine();
      chat();
    }
    else{
      l=0;
	  System.out.println("\n");
	  System.out.println("\n");
      System.out.println("\t\t\t\t\t Enter the User ID of the friend you want to chat with : ");
	  System.out.print("\t\t\t\t\t ");
      frw=sc.nextLine();
      pst=con.prepareStatement("select username from menu1 where username='"+frw+"'");
      rs=pst.executeQuery();
      while(rs.next()){
        l++;
      }

      if(l==0){
        System.out.println("\t\t\t\t\t User ID doesn't exit!!!");
				System.out.print("\t\t\t\t\t Press enter to continue...");
				sc.nextLine();
        chat();
      }
      else{
        PreparedStatement ps=con.prepareStatement("select status3 from menu2 where username1='"+fr+"' and username2='"+frw+"'");
        ResultSet r=ps.executeQuery();
        PreparedStatement ps1=con.prepareStatement("select status3 from menu2 where username1='"+frw+"' and username2='"+fr+"'");
        ResultSet r1=ps1.executeQuery();
        while(r.next()){
          while(r1.next()){
            if(r.getString(1).equals("false") && r1.getString(1).equals("false")){
        pst=con.prepareStatement("update menu2 set status3='true' where username1='"+fr+"' and username2='"+frw+"'");
        if(pst.executeUpdate()>0);

          //chatscreen(frw);
		  cls();
		i=1;
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Enjoy Chat      !!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		     
	for(i=1;i<=32;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
			System.out.print("\n\t\t\t\t\t ");
					mainchat(fr,frw);
    }
    else{
      recentchat();
    }
      }}
      }//else
    } //method
  }
    public static void chatscreen(String frw) throws Exception{
		cls();
		int i=1;
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t!!!!\t   Enjoy Chat      !!!! ");
		System.out.print("\t\t\t\t\t\t\t\t");
		     
	for(i=1;i<=32;i++)
		System.out.print("_");
	for(i=1;i<=5;i++)
		System.out.println("\n");
		System.out.print("\n");
		
		System.out.print("\t\t\t\t\t ");
	for(i=1;i<=76;i++)
		System.out.print("_");
		System.out.print("\n");
		System.out.print("\t\t\t\t\t|");
	for(i=1;i<=76;i++)
			System.out.print(" ");
		System.out.print("|");
			System.out.print("\n");
		String st=new String("");
		int o=0,sum=0;
		PreparedStatement pst=con.prepareStatement("select chat from menu2 where username1='"+fr+"' and username2='"+frw+"'");
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			st=rs.getString(1);
			if(st.equals(""))
			{
				pst=con.prepareStatement("select chat from menu2 where username1='"+frw+"' and username2='"+fr+"'");
				rs=pst.executeQuery();
				while(rs.next()){
					st=rs.getString(1);}
			}
		}
		String sp1=new String("");
		String sp2=new String("");
		sp1=sp1.concat(fr);
		sp2=sp2.concat(frw);
			sp1=sp1.concat("____ ");
			sp2=sp2.concat("____ ");
			//System.out.println(sp1+","+sp2);
		String[] s=st.split(sp1);
		for(String s1 : s){
			String[] s4=s1.split(sp2);
			for(String s2 : s4){
				PreparedStatement pst1=con.prepareStatement("select status3 from menu2 where username1='"+fr+"' and username2='"+frw+"'");
				ResultSet rs1=pst1.executeQuery();
				if(sum==0){
				while(rs1.next()){
					if(rs1.getString(1).equals("true")){
						sum++;
						System.out.println("\t\t\t\t\t\t\t\t\t\t"+s2);

						o++;
					}
					else{
						System.out.println("\t\t\t\t\t\t\t\t\t\t"+s2);
						sum++;
					}

				}   //while
				//sum++;
			//	mainchat(fr,frw);
			}   //ifsum
			else{
				PreparedStatement pst4=con.prepareStatement("select status3 from menu2 where username1='"+fr+"' and username2='"+frw+"'");
				ResultSet rs4=pst4.executeQuery();
				while(rs4.next()){
					if(rs4.getString(1).equals("true")){
						System.out.println("\t\t\t\t\t\t"+s2);
						o++;
					}
					else{
						System.out.println("\t\t\t\t\t\t"+s2);
					}

				}   //while
			}
			}   //for 2
			sum=0;
		}   //for 1
		//System.out.println(sp1+","+sp2);
		System.out.print("\t\t\t\t\t  ");

	}   //method
	public static void main(String[] arr) throws Exception
	{
		try
		{
			Front();
		}
		catch(NoSuchElementException e)
		{
			Front();
		}
	}
}
