package Marathon_code;

public class BMW_M8_Competetion extends Car {

	static Database database = new Database();
	
	private String model = "BMW_M8_Competetion";
	private String feulType = "Petrol";
	private String engineDisplacement = "1499cc";
	private int seatingCapacity = 5;
	private float maxPower = 591.00f;
	private String color = "BARCELONA BLUE METALLIC";
	private String price = "88.44 Lakh";
	
	
	public BMW_M8_Competetion(String model, String feulType, String engineDisplacement, int seatingCapacity,
			float maxPower, String color, String price) {
		
		super(model, feulType, engineDisplacement, seatingCapacity, maxPower, color, price);
	}
	
	BMW_M8_Competetion()
	{
		
	}
	
	public void loadCar()
	{
		BMW_M8_Competetion bmw8 = new BMW_M8_Competetion(model,feulType,engineDisplacement,seatingCapacity,maxPower,color,price);
        database.Addcar(bmw8);
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
		System.out.println("-> ADAPTIVE SUSPENSION ");
		System.out.println("");
		System.out.println("-> HEATER");
		System.out.println(" ");
		System.out.println("-> VENTILATED SEAT");
		
	}

	@Override
	public void reason() {
		System.out.println("");
		System.out.println("");
		System.out.println("------------5 GOOD REASONS FOR THE BMW 2 SERIES---------------------");
		System.out.println("");
		System.out.println("1"+" "+"STRENGTH,ELEGANCE,AERODYNAMIC FINESSSE ALL COME TOGETHER IN EXTERIOR");
		System.out.println("");
		System.out.println("2"+" "+"THE M TWIN POWER TURBO 8 CYLINDER PETROL ENGINE(MOST POWERFULL ENGINE)");
		System.out.println("");
		System.out.println("3"+" "+"DRIVING DYNAMICS:SUPREME AGILITY AND EXCELLENT RIDE COMFORT");
		System.out.println("");
		System.out.println("4"+" "+"LATEST AND MOST INNOVATIVE DRIVER COOCKPIT");
		System.out.println("");
		System.out.println("5"+" "+"750NM OF TORQUE AND ACCELERATION FROM 0 TO 100 KM/H IN 3.2 SECONDS");
	}
	
	
	
}
