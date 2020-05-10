package icecream;

import java.util.ArrayList;

public class ConcreteIceCream extends IceCreamAbs {

	public ConcreteIceCream() {
		
		flavors = new ArrayList<>();
	}
	
	@Override
	public float cost() {
		float temp = 0;
		for(IceCreamFlavors flv : flavors) {
			temp = temp + flv.cost();
		}
		
		return temp;
	}

	@Override
	public void description() {
		for(IceCreamFlavors flv : flavors) {
			flv.description();
		}
	}

	
	
	
}
