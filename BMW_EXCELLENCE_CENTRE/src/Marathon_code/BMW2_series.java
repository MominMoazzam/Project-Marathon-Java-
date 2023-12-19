package Marathon_code;

public class BMW2_series extends Car {

	static Database database = new Database();

	private String model = "BMW2";
	private String feulType = "PETROL/DIESEL";
	private String engineDisplacement = "2993cc";
	private int seatingCapacity = 5;
	private float maxPower = 375.48f;
	private String color = "OXIDE GREY METALLIC";
	private String price = "45.50Lakh";

	BMW2_series(String model, String feulType, String engineDisplacement, int seatingCapacity, float maxPower,
			String color, String price) {

		super(model, feulType, engineDisplacement, seatingCapacity, maxPower, color, price);

	}

	BMW2_series() {

	}

	public void loadCar() {
		BMW2_series bmw2 = new BMW2_series(model, feulType, engineDisplacement, seatingCapacity, maxPower, color,
				price);
		database.Addcar(bmw2);
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

	}

	@Override
	public void reason() {
		System.out.println("");
		System.out.println("");
		System.out.println("------------5 GOOD REASONS FOR THE BMW 2 SERIES---------------------");
		System.out.println("");
		System.out.println("1" + " " + "SPORTY,PROGRESSIVE EXTERIOR DESIGN");
		System.out.println("");
		System.out.println("2" + " " + "EXCELLENT DRIVING DYNAMICS");
		System.out.println("");
		System.out.println("3" + " " + "PREMIUM AMBIENCE IN THE INTERIOR");
		System.out.println("");
		System.out.println("4" + " " + "INNOVATIVE DRIVE TECHNOLOGIES");
		System.out.println("");
		System.out.println("5" + " " + "CONNECTIVITY AT THE HIGHEST LEVEL");

	}

}
