package Marathon_code;

public abstract class Car {

	private String model;

	public String getmodel() {
		return model;
	}

	private String feulType;

	public String getFeulType() {
		return feulType;
	}

	private String engineDisplacement;

	public String getEngineDisplacement() {
		return engineDisplacement;
	}

	private int seatingCapacity;

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	private float maxPower;

	public float getMaxPower() {
		return maxPower;
	}

	private String color;

	public String getColor() {
		return color;
	}

	private String price;

	public String getPrice() {
		return price;
	}

	Car() {

	}

	public Car(String model, String feulType, String engineDisplacement, int seatingCapacity, float maxPower,
			String color, String price) {
		this.model = model;
		this.feulType = feulType;
		this.engineDisplacement = engineDisplacement;
		this.seatingCapacity = seatingCapacity;
		this.maxPower = maxPower;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println("model:" + " " + model);
		System.out.println("feulType:" + " " + feulType);
		System.out.println("engineDisplacement:" + " " + engineDisplacement);
		System.out.println("seatingCapacity:" + " " + seatingCapacity);
		System.out.println("maxPower:" + " " + maxPower);
		System.out.println("color:" + " " + color);
		System.out.println("price:" + " " + price);
		return " ";
	}

	public abstract void loadCar();

	public abstract void feature();

	public abstract void reason();

}
