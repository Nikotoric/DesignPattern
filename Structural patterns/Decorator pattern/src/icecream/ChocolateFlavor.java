package icecream;

public class ChocolateFlavor extends IceCreamFlavors {

	public ChocolateFlavor(int num, float price) {

		this.numOfBalls = num;
		this.price = price;

	}

	@Override
	public void description() {
		System.out.println(this.getClass().getSimpleName() + " with total number of balls " + numOfBalls);
	}

}