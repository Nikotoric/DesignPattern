package icecream;

import java.util.ArrayList;

public abstract class IceCreamAbs {

	protected float price;
	protected ArrayList<IceCreamFlavors> flavors;

	public abstract float cost();

	public abstract void description();

	public void addFlavor(IceCreamFlavors flavor) {

		flavors.add(flavor);

	}

}
