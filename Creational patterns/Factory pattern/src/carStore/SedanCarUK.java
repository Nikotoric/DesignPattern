package carStore;

public class SedanCarUK extends Car {

	public SedanCarUK(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Sudan UK version car");
	}

	@Override
	public String toString() {
		return "Order details: A Sudan UK version car was ordered..";
	}

}
