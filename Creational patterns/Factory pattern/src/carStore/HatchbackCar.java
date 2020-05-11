package carStore;

public class HatchbackCar extends Car {

	public HatchbackCar(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Hatchback EU version car");
	}

	@Override
	public String toString() {
		return "Order details: A Hatchback EU version car was ordered..";
	}

}
