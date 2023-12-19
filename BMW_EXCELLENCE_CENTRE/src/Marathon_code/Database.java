package Marathon_code;

import java.util.ArrayList;

public class Database {

	ArrayList<User> user = new ArrayList<User>();
	ArrayList<String> name = new ArrayList<String>();

	static ArrayList<Car> BMW = new ArrayList<Car>();

	public void AddUser(User s) {
		user.add(s);
		name.add(s.getname());
	}

	public int login(String phonenumber, String Email) {
		int n = -1;
		for (User s : user) {
			if (s.getphonenumber().equals(phonenumber) && s.getEmail().equals(Email)) {
				n = user.indexOf(s);
				break;
			}
		}
		return n;
	}

	public User getuser(int n) {
		return user.get(n);
	}

	public String getname(int n) {
		return name.get(0);
	}

	public void Addcar(Car c) {
		BMW.add(c);
		System.out.println("**********SPECIFICATION***********");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("MODEL:" + " " + c.getmodel());
		System.out.println(" ");
		System.out.println("FEUL TYPE:" + " " + c.getFeulType());
		System.out.println("");
		System.out.println("ENGINE DISPLACEMENT:" + " " + c.getEngineDisplacement());
		System.out.println("");
		System.out.println("SEATING CAPACITY:" + " " + c.getSeatingCapacity());
		System.out.println("");
		System.out.println("MAX POWER:" + " " + c.getMaxPower());
		System.out.println("");
		System.out.println("COLOR:" + " " + c.getColor());
		System.out.println("");
		System.out.println("PRICE:" + " " + c.getPrice());
		
		System.out.println(
				"                                                   -----------------------------------------                                               ");
	}

}
