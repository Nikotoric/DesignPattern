package spaceShip;

public class TransWarpPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("Propulsion = " + getClass().getSimpleName());
	}

}
