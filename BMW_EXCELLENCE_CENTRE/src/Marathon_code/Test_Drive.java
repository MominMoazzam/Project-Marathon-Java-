package Marathon_code;

import java.util.Scanner;
public abstract class Test_Drive extends Car {
	Test_Drive()
	{
		
	}

	public static void testDrive()
	{
		Database database = new Database();
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("-----------------------------ENTER BOOKING DETAILS--------------------------------");
		System.out.println("");
		System.out.println("ENTER FIRST NAME:");
		String fname= sc.next();
		System.out.println("ENTER EMAIL ID:");
		String emailid = sc.next();
		System.out.println("ENTER MOBILE NUMBER:");
		 long phonenumber = sc.nextLong();
		 int a=phno(phonenumber);
		 if(a==1)
		 {
			 System.out.println("ENTER PREFERED CITY:");
				String city = sc.next();
				System.out.println("YOU HAVE BOOKED FOR A TEST DRIVE SUCCESSFULLLY");
		 }
		 else {
			 System.err.println("INVALID MOBILE NUMBER:");
			 testDrive();
		 }
	
	}
	public static int phno(long phonenumber)
	{
		int total =10;
		int count =0;
		while(phonenumber!=0)
		{
			int digit =(int) phonenumber%10;
			count++;
			phonenumber=phonenumber/10;
		}
		if(count == total)
		{
			return 1;
		}
		return 0;
	}
}
