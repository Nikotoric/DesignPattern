package icecream;

public class HoneyOverflowDecorator extends IceDecoratorAbs {

	public HoneyOverflowDecorator(IceCreamAbs iceCream, float price) {
		
		this.iceCreamAbs = iceCream;
		this.price = price;

	}

	@Override
	public float cost() {
		return iceCreamAbs.cost() + price;
	}

	@Override
	public void description() {
		iceCreamAbs.description();
		System.out.println("Decorated with -> " + this.getClass().getSimpleName());
	}
}
