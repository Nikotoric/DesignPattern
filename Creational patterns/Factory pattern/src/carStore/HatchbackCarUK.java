package carStore;

public class HatchbackCarUK extends Car {

	public HatchbackCarUK(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for Hatchback UK version car");
	}

	@Override
	public String toString() {
		return "Order details: A Hatchback UK version car was ordered..";
	}

}