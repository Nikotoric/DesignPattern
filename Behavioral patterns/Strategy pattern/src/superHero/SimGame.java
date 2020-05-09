package superHero;

public class SimGame {
	
	private static Hero hro;
	
	public static void main(String[] args) {
		
		hro = new Hero();
		System.out.println(hro.toString());
		hro.setAndApplyAbilityStrategy(new LongDistVisionStrategy());
		System.out.println(hro.toString());
	}

}
