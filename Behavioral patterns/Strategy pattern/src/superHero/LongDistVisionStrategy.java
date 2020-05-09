package superHero;

public class LongDistVisionStrategy implements AbilityStrategy {

	@Override
	public void applyAbility() {
		System.out.println("Ability -> " + getClass().getSimpleName());
		
	}

}
