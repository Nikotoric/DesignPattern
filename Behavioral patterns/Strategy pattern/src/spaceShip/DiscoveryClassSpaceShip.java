package spaceShip;

import java.util.Random;

public class DiscoveryClassSpaceShip extends AbsSpaceShipClass {
	

	public DiscoveryClassSpaceShip(String captain, ISpacePropulsion propulsion) {
		
		this.captain = captain;
		id = new Random().nextInt(1000);
		this.propulsion = propulsion;

	}

	@Override
	protected void performFlyingWithPropulsion() {
		System.out.println(toString());
		propulsion.engagePropulsion();

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + " [id =  "+ id + ", propulsion = " + propulsion.getClass().getSimpleName() + ", captain = " + captain + "]";
	}

}
