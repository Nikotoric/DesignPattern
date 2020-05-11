package carStore;

public class CabrioletCarUK extends Car {

	public CabrioletCarUK(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Cabrio UK version car");
	}

	@Override
	public String toString() {
		return "Order details: A Cabriolet UK version car was ordered..";
	}

}