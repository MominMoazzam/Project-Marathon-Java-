package Marathon_code;

public class BMW3series_Gran_Limousine extends Car {

	static Database database = new Database();
	
	private String model = "BMW3series_Gran_Limousine";
	private String feulType = "PETROL/DIESEL";
	private String engineDisplacement = "1995cc to 1998cc";
	private int seatingCapacity = 5;
	private float maxPower = 187.74f;
	private String color = "OXIDE GREY METALLIC";
	private String price = "60.50Lakh";
	
	
	
	public BMW3series_Gran_Limousine(String model, String feulType, String engineDisplacement, int seatingCapacity,
			float maxPower, String color, String price) {
		
		super(model, feulType, engineDisplacement, seatingCapacity, maxPower, color, price);
	}



	public BMW3series_Gran_Limousine() {
		
	}
	
	public void loadCar()
	{
		BMW3series_Gran_Limousine bmw3 = new BMW3series_Gran_Limousine(model,feulType,engineDisplacement,seatingCapacity,maxPower,color,price);
        database.Addcar(bmw3);
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
		
	}



	@Override
	public void reason() {
		System.out.println("");
		System.out.println("");
		System.out.println("------------5 GOOD REASONS FOR THE BMW 2 SERIES---------------------");
		System.out.println("");
		System.out.println("1"+" "+"LONGEST AND MOST SPACIOUS CAR IN ITS SEGMENT");
		System.out.println("");
		System.out.println("2"+" "+"EXCELLENT ROAD HOLDING ,SPORTY HANDLING AND HIGH AGILITY");
		System.out.println("");
		System.out.println("3"+" "+"SPORTY AND DISTINCTIVE DESIGN");
		System.out.println("");
		System.out.println("4"+" "+"BMW CURVED DISPLAY WITH CONNECTED DRIVE");
		System.out.println("");
		System.out.println("5"+" "+"DRIVER ASSITANCE SYSTEMS");
		
	}
	
	
	
	
	
}
