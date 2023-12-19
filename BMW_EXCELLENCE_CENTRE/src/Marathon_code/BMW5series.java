package Marathon_code;

public class BMW5series extends Car {

	static Database database = new Database();
	
	private String model = "BMW5 series";
	private String feulType = "DIESEL";
	private String engineDisplacement = "1995cc";
	private int seatingCapacity = 5;
	private float maxPower = 190.00f;
	private String color = "OXIDE GREY METALLIC";
	private String price = "68.90Lakh";
	
	
	public BMW5series(String model, String feulType, String engineDisplacement, int seatingCapacity, float maxPower,
			String color, String price) {
		
		super(model, feulType, engineDisplacement, seatingCapacity, maxPower, color, price);
	}
	
	BMW5series()
	{
		
	}
	
	public void loadCar()
	{
		BMW5series bmw5 = new BMW5series(model,feulType,engineDisplacement,seatingCapacity,maxPower,color,price);
        database.Addcar(bmw5);
	}

	@Override
	public void feature() {
		System.out.println("");
		System.out.println("");
		System.out.println("************FEATURE************");
		System.out.println("");
		System.out.println("-> POWER STEERING");
		System.out.println("");
		System.out.println("-> POWER WINDOWS FRONT");
		System.out.println("");
		System.out.println("-> ANTI LOCK BRAKING SYSTEM");
		System.out.println("");
		System.out.println("-> AIR CONDITIONER");
		System.out.println("");
		System.out.println("-> DRIVER AIRBAG");
		System.out.println("");
		System.out.println("-> FOG LIGHTS-FRONT");
		System.out.println("");
		System.out.println("-> ALLOY WHEELS");
		System.out.println("");
		System.out.println("-> MULTI-FUNCTION STEERING WHEEL");
		System.out.println("");
		System.out.println("-> ADJUSTABLE HEADREST");
		System.out.println("");
		System.out.println("-> LUGGAGE HOOK & NET");
		System.out.println("");
		System.out.println("-> NAVIGATION SYSTEM");
		System.out.println("");
		System.out.println("-> VOICE COMMAND");
		System.out.println(" ");
		System.out.println("-> DIGITAL CLOCK");
		System.out.println(" ");
	    System.out.println("-> RAIN SENSING WIPER");
		
	}

	@Override
	public void reason() {
		System.out.println("");
		System.out.println("");
		System.out.println("------------5 GOOD REASONS FOR THE BMW 2 SERIES---------------------");
		System.out.println("");
		System.out.println("1"+" "+"ACCELERATION 0-100 KM/H IN 5.7SEC");
		System.out.println("");
		System.out.println("2"+" "+"BMW ADAPTIVE LED HEAD LIGHTS");
		System.out.println("");
		System.out.println("3"+" "+"MOST ADVANCED DRIVER ASSISTANCE SYSTEMS");
		System.out.println("");
		System.out.println("4"+" "+"ADAPTIVE SUSPENSION");
		System.out.println("");
		System.out.println("5"+" "+"ATHELETIC AND AESTHETIC EXTERIOR DESIGN");
		
	}
	
	
	
}
