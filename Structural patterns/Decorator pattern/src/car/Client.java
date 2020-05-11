package car;

public class Client {

	public static void main(String[] args) {

		Auto car = new GlassMode(new Suspension(new EnginePower(new CarModel("Chevrolet Impala"))));

		System.out.println(car.changeCarPref());

	}

}
