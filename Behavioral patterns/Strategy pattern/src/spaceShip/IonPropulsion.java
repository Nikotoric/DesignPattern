package spaceShip;

public class IonPropulsion implements ISpacePropulsion {

	@Override
	public void engagePropulsion() {
		System.out.println("Propulsion = " + getClass().getSimpleName());
	}

}
