package car;

public class CarModel implements Auto {

	String name;

	public CarModel(String name) {
		this.name = name;
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String changeCarPref() {
		String modelCar = "Car model - " + name;
		return modelCar;
	}

}
