package icecream;

public class VanillaFlavor extends IceCreamFlavors {

	public VanillaFlavor(int num, float price) {

		this.numOfBalls = num;
		this.price = price;

	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName() + " with total number of balls " + numOfBalls);
	}

}
