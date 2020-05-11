package car;

public class Suspension extends CarUpgrade {

	public Suspension(Auto auto) {
		super(auto);
	}

	@Override
	public String changeCarPref() {
		String car = auto.changeCarPref() + "\n- Suspension upgraded with 26' wheels ans gas suspension";
		return car;
	}

}
