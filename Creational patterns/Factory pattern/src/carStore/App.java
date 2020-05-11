package carStore;

public class App {

	public static void main(String[] args) {

		CarStore csEU = new FactoryEU();
		csEU.carOrder("Sedan", "Red");

		System.out.println();

		CarStore csUK = new FactoryUK();
		csUK.carOrder("Cabriolet", "Light brown");

	}

}
