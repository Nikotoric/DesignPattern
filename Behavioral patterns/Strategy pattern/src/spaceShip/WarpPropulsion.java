package spaceShip;

public class WarpPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("Propulsion = " + getClass().getSimpleName());
	}

}
