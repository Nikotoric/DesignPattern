package superHero;

public class Hero {
	
	private AbilityStrategy abs;
	
	public Hero() {
		abs = new ZeroStrategy();
	}
	
	public void setAndApplyAbilityStrategy(AbilityStrategy abs) {
		this.abs = abs;
		abs.applyAbility();
	}

	@Override
	public String toString() {
		
		if(this.abs instanceof ZeroStrategy) {
			return "This is not a hero, but average person ...";
		} else {
			return "Hero [abs=" + abs + "]";
		}
		
	}
	
	

}
