package Marathon_code;

import java.util.Scanner;
import java.util.Date;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Database database = new Database();
	static double total;
	static Test_Drive td;

	static {
		System.out.println("");
		System.out.println(
				"-------------------------------------------------BMW EXCELLENCE CENTER-----------------------------------------------------");
		System.out.println("");
	}

	public static void main(String[] args) {
		System.out.println("----------------------------SIGNUP DETAILS------------------------------");
		System.out.println(" ");
		System.out.println("PRESS 1 FOR LOGIN");
		System.out.println("PRESS 2 FOR NEWUSER");
		System.out.println("PRESS 3 FOR Exit");
		System.out.println();
		System.out.println("ENTER YOUR CHOICE:");
		try {
			Scanner sc1 = new Scanner(System.in);
			int n = sc1.nextInt();
			switch (n) {
			case 1:
				Login();
				break;
			case 2:
				NewUser();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.err.println("PLEASE ENTER VALID INPUT");
				main(args);
				break;
			}
		} catch (Exception e) {
			System.err.println("PLEASE ENTER VALID INPUT");
			main(args);
		}

	}

	public static void Login() {
		System.out.println("ENTER PHONENUMBER:");
		String phonenumber = sc.next();
		System.out.println("ENTER EMAIL:");
		String email = sc.next();
		User admin1 = new Admin("9307972759", "MOAZZAM", "Pass@2211");
		database.AddUser(admin1);

		int n = database.login(phonenumber, email);
		if (n != -1) {
			User user = database.getuser(n);
			System.out.println(" ");
			System.out.println("WELCOME" + " " + user.getname());
			System.out.println("");
			System.out.println("----------------LOGIN SUCCESSFULL------------------");
			System.out.println("");
			selectCar();
		} else {
			System.out.println("");
			System.err.println("USER DOSENT EXIST:");
			System.out.println("");
			System.out.println("PLEASE FILL THE REGISTRATION DETAILS:");
			System.out.println("");
			NewUser();
		}
	}

	public static void NewUser() {
		System.out.println("ENTER FIRST NAME:");
		String fname = sc.next();
		System.out.println("ENTER LAST NAME:");
		String lname = sc.next();
		System.out.println("ENTER YOUR EMAIL:");
		String Email = sc.next();
		System.out.println("ENTER PHONENUMBER::");
		String phonenumber = sc.next();

		System.out.println("1. ADMIN");
		System.out.println("2.NORMAL USER");
		System.out.println("");
		int n2 = sc.nextInt();
		if (n2 == 1) {
			User admin = new Admin(phonenumber, fname, Email);
			database.AddUser(admin);
			System.out.println("---YOU HAVE REGISTERED SUCCESSFULLY---");
			System.out.println(" ");
			System.out.println("WELCOME" + " " + admin.getname());
			System.out.println("");
			selectCar();
		} else if(n2==2){
			User Nuser = new Normal_User(phonenumber, fname, Email);
			database.AddUser(Nuser);
			System.out.println(" ");
			System.out.println("---YOU HAVE REGISTERED SUCCESSFULLY---");
			System.out.println(" ");
			System.out.println("WELCOME" + " " + Nuser.getname());
			System.out.println("");
			selectCar();
		}
		else {
			selectCar();
			
		}

	}

	public static void selectCar() {
		System.out.println(
				"*************************//*********************AVAILABLE BMW MODEL*************************//***********************************");
		System.out.println("");
		System.out.println("1) BMW2 SERIES:");
		System.out.println("");
		System.out.println("2) BMW3series GRAN LIMOUSINE");
		System.out.println("");
		System.out.println("3) BMW5series");
		System.out.println("");
		System.out.println("4) BMW Electric");
		System.out.println(" ");
		System.out.println("5) BMW M8 COMPETETION");
		System.out.println("");
		System.out.println("ENTER YOUR CHOICE:");

		try {
			Scanner sltcar = new Scanner(System.in);
			int n = sltcar.nextInt();
			switch (n) {
			case 1:
				Car two = new BMW2_series();
				two.loadCar();
				
				two.feature();
				two.reason();
				System.out.println("");
				System.out.println("PRESS 1 TO RESERVE A CAR:");
				System.out.println("PRESS 2 TO EXPLORE MORE CARS:");
				System.out.println("PRESS 3 TO BOOK YOUR TEST DRIVE");
				System.out.println("PRESS 4 TO EXIT");
				int n2 = sc.nextInt();
				try {
					switch (n2) {
					case 1:
						System.out.println("-----------------------CAR RENTAL DETAIL----------------------------:");
						System.out.println("PRICE FOR A CAR RENT IS :");
						System.out.println("HOURLY CAR RENTAL RATE: 800"+" "+"RUPEES");
						System.out.println("WANT TO RESERVE PRESS 1 OR ELSE PRESS 2");
						Scanner c = new Scanner(System.in);
						int q =c.nextInt();
						if(q==1)
						{
						total = total + 800;
						bill();
						}
						else {
							selectCar();
						}
						break;
					case 2:
						selectCar();
						break;
					case 3:
						Test_Drive.testDrive();
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.err.println("INVALID INPUT");
						selectCar();
						break;
					}
				} catch (Exception e) {
					System.err.println("INVALID INPUT");
					selectCar();
				}
				break;

			case 2:
				Car bmw3 = new BMW3series_Gran_Limousine();
				bmw3.loadCar();
				
				bmw3.feature();
				bmw3.reason();
				System.out.println("");
				System.out.println("PRESS 1 TO RESERVE A CAR:");
				System.out.println("PRESS 2 TO EXPLORE MORE CARS:");
				System.out.println("PRESS 3 TO BOOK YOUR TEST DRIVE");
				System.out.println("PRESS 4 TO EXIT");
				int n3 = sc.nextInt();
				try {
					switch (n3) {
					case 1:
						System.out.println("-----------------------CAR RENTAL DETAIL----------------------------:");
						System.out.println("PRICE FOR A CAR RENT IS :");
						System.out.println("HOURLY CAR RENTAL RATE: 800"+" "+"RUPEES");
						System.out.println("WANT TO RESERVE PRESS 1 OR ELSE PRESS 2");
						Scanner c = new Scanner(System.in);
						int q =c.nextInt();
						if(q==1)
						{
						total = total + 800;
						bill();
						}
						else {
							selectCar();
						}
						break;
					case 2:
						selectCar();
						break;
					case 3:
						Test_Drive.testDrive();
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.err.println("INVALID INPUT");
						selectCar();
						break;
					}
				} catch (Exception e) {
					System.err.println("INVALID INPUT");
					selectCar();
				}

				break;

			case 3:
				Car bmw5 = new BMW5series();
				bmw5.loadCar();
				
				bmw5.feature();
				bmw5.reason();
				System.out.println("");
				System.out.println("PRESS 1 TO RESERVE A CAR:");
				System.out.println("PRESS 2 TO EXPLORE MORE CARS:");
				System.out.println("PRESS 3 TO BOOK YOUR TEST DRIVE");
				System.out.println("PRESS 4 TO EXIT");
				int n5 = sc.nextInt();
				try {
					switch (n5) {
					case 1:
						System.out.println("-----------------------CAR RENTAL DETAIL----------------------------:");
						System.out.println("PRICE FOR A CAR RENT IS :");
						System.out.println("HOURLY CAR RENTAL RATE: 800"+" "+"RUPEES");
						System.out.println("WANT TO RESERVE PRESS 1 OR ELSE PRESS 2");
						Scanner c = new Scanner(System.in);
						int q =c.nextInt();
						if(q==1)
						{
						total = total + 800;
						bill();
						}
						else {
							selectCar();
						}
						break;
					case 2:
						selectCar();
						break;
					case 3:
						Test_Drive.testDrive();
						break;
					case 4:
						System.exit(0);
						break;
					default:
						System.err.println("INVALID INPUT");
						selectCar();
						break;
					}
				} catch (Exception e) {
					System.err.println("INVALID INPUT");
					selectCar();
				}

				break;

			case 4:
				Scanner s = new Scanner(System.in);
				Car bmwe = new BMWelectric();
				bmwe.loadCar();
				
				bmwe.feature();
				bmwe.reason();
				System.out.println("");
				System.out.println("PRESS 1 TO RESERVE A CAR:");
				System.out.println("PRESS 2 TO EXPLORE MOR CARS:");
				System.out.println("PRESS 3 TO BOOK YOUR TEST DRIVE");
				System.out.println("PRESS 4 TO EXIT");
				int ne = s.nextInt();
				try {
					switch (ne) {
					case 1:
						System.out.println("-----------------------CAR RENTAL DETAIL----------------------------:");
						System.out.println("PRICE FOR A CAR RENT IS :");
						System.out.println("HOURLY CAR RENTAL RATE: 800"+" "+"RUPEES");
						System.out.println("WANT TO RESERVE PRESS 1 OR ELSE PRESS 2");
						Scanner c = new Scanner(System.in);
						int q =c.nextInt();
						if(q==1)
						{
						total = total + 800;
						bill();
						}
						else {
							selectCar();
						}
						break;
					case 2:
						selectCar();
						break;
					case 3:
						Test_Drive.testDrive();
						break;
					case 4:
						System.exit(0);
						break;

					default:
						System.err.println("INVALID INPUT");
						selectCar();
						break;
					}
				} catch (Exception e) {
					System.err.println("INVALID INPUT");
					selectCar();
				}
				break;
			case 5:
				Car bmw8 = new BMW_M8_Competetion();
				bmw8.loadCar();
				
				bmw8.feature();
				bmw8.reason();
				System.out.println("");
				System.out.println("PRESS 1 TO RESERVE A CAR:");
				System.out.println("PRESS 2 TO EXPLORE MORE CARS:");
				System.out.println("PRESS 3 TO BOOK YOUR TEST DRIVE");
				System.out.println("PRESS 4 TO EXIT");
				int n8 = sc.nextInt();
				try {
					switch (n8) {
					case 1:
						System.out.println("-----------------------CAR RENTAL DETAIL----------------------------:");
						System.out.println("PRICE FOR A CAR RENT IS :");
						System.out.println("HOURLY CAR RENTAL RATE: 800"+" "+"RUPEES");
						System.out.println("WANT TO RESERVE PRESS 1 OR ELSE PRESS 2");
						Scanner c = new Scanner(System.in);
						int q =c.nextInt();
						if(q==1)
						{
						total = total + 800;
						bill();
						}
						else {
							selectCar();
						}
						break;
					case 2:
						selectCar();
						break;
					case 3:
						Test_Drive.testDrive();
						break;
					case 4:
						System.exit(0);
						break;

					default:
						System.err.println("INVALID INPUT");
						selectCar();
						break;
					}
				} catch (Exception e) {
					System.err.println("INVALID INPUT");
					selectCar();
				}
			break;	
			default:
				System.err.println("INVALID INPUT");
				selectCar();
				break;
			}
		} catch (Exception e) {
			System.err.println("INVALID INPUT");
			selectCar();
		}

	}

	public static void bill() {

		System.out.println("");

		System.out.println(
				"-----------------------------------------------------------RENT RECEIPT---------------------------------------------------------------------");

//		
		long millis = System.currentTimeMillis();

		// creating a new object of the class Date
		Date date = new Date(millis);
		System.out.println(date);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("TOTAL:" + total + "ONLY");
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("THANK YOU VISIT AGAIN");

	}
}
