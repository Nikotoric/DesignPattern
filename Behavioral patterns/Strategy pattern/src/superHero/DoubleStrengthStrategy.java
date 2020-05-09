package superHero;

public class DoubleStrengthStrategy implements AbilityStrategy {

	@Override
	public void applyAbility() {
		
		System.out.println("Ability -> " + getClass().getSimpleName());
		
	}

}
