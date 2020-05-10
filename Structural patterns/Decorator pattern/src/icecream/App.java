package icecream;

public class App {

	public static void main(String[] args) {
		
		ChocolateFlavor choc = new ChocolateFlavor(2, (float) 10.5);
		VanillaFlavor van = new VanillaFlavor(1, (float) 10.5);
		
		ConcreteIceCream iceCream = new ConcreteIceCream();
		iceCream.addFlavor(van);
		iceCream.addFlavor(choc);
		
		HoneyOverflowDecorator hon = new HoneyOverflowDecorator(iceCream, 4);
		HazelnutPowderDecorator haz = new HazelnutPowderDecorator(hon, 5);
		haz.description();
		
		System.out.println("Total cost: " + haz.cost());

	}

}
