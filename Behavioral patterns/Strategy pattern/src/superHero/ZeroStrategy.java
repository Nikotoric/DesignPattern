package superHero;

public class ZeroStrategy implements AbilityStrategy {
	
	@Override
	public void applyAbility() {
		System.out.println("Ability -> " + getClass().getSimpleName());
		System.out.println("This is a person with the average natural abilities ... ");
		
	}

}
