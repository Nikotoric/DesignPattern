package carStore;

public class CabrioletCar extends Car {

	public CabrioletCar(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Cabrio EU version car");
	}

	@Override
	public String toString() {
		return "Order details: A Cabrio EU version was ordered..";
	}

}
