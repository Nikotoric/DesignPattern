package car;

public class HybrideMode extends CarUpgrade {

	public HybrideMode(Auto auto) {
		super(auto);
	}

	@Override
	public String changeCarPref() {
		String car = auto.changeCarPref() + "\n- Upgrade with hybrid technology..";
		return car;
	}

}
