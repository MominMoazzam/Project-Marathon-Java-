package Marathon_code;

public class BMWelectric extends Car {

static Database database = new Database();
	
	private String model = "BMW Electric";
	private String feulType = "Electric";
	private String engineDisplacement = "1499cc";
	private int seatingCapacity = 5;
	private float maxPower = 102.00f;
	private String color = "OXIDE GREY METALLIC";
	private String price = "84.90Lakh";
	
	
	public BMWelectric(String model, String feulType, String engineDisplacement, int seatingCapacity, float maxPower,
			String color, String price) {
		
		super(model, feulType, engineDisplacement, seatingCapacity, maxPower, color, price);
	}
	
	
	BMWelectric()
	{
		
	}
	
	public void loadCar()
	{
		BMWelectric bmwe = new BMWelectric(model,feulType,engineDisplacement,seatingCapacity,maxPower,color,price);
        database.Addcar(bmwe);
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
		System.out.println("-> FAST CHARGING");
		System.out.println("");
		System.out.println("-> FRONT AND REAR PARKING SENSOR");
		System.out.println(" ");
		System.out.println("-> ELECTRIC FOLDING REAR VIEW MIRROR");
		
	}


	@Override
	public void reason() {
		System.out.println("");
		System.out.println("");
		System.out.println("------------5 GOOD REASONS FOR THE BMW 2 SERIES---------------------");
		System.out.println("");
		System.out.println("1"+" "+"MORE THAN 400KM OF RANGE");
		System.out.println("");
		System.out.println("2"+" "+"326 HORSEPOWER");
		System.out.println("");
		System.out.println("3"+" "+"FROM 0 TO 100KM/H IN 6.1 SECONDS");
		System.out.println("");
		System.out.println("4"+" "+"RECHARGING 95 KM IN TEN MINUTES");
		System.out.println("");
		System.out.println("5"+" "+"ELECTRIC ALL-WHEEL DRIVE");
		
	}
	
	
	
	
}
