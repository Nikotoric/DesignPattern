package carStore;

public class SedanCar extends Car {

	public SedanCar(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Sudan EU version car");
	}

	@Override
	public String toString() {
		return "Order details: A Sudan EU version car was ordered..";
	}

}
