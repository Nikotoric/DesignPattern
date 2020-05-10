package icecream;

public abstract class IceCreamFlavors {
	
	protected int numOfBalls;
	protected float price;
	
	public float cost() {
		return numOfBalls * price;
	}
	
	public abstract void description();

}
