package carStore;

public class SUVCarUK extends Car {

	public SUVCarUK(String type) {
		super(type);
	}

	@Override
	public void manufacture() {
		super.manufacture();
		System.out.println("Specialized manufacturing processes for SUV UK version car");
	}

	@Override
	public String toString() {
		return "Order details: A SUV UK version car was ordered";
	}

}
