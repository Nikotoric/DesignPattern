package carStore;

public class SUVCar extends Car {

	public SUVCar(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for SUV EU version car");
	}

	@Override
	public String toString() {
		return "Order details: A SUV EU version car was ordered..";
	}

}
