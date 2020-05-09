package spaceShip;

public abstract class AbsSpaceShipClass {
	
	protected int id;
	protected ISpacePropulsion propulsion;
	protected String captain;
	
	
	protected void setPropulsion(ISpacePropulsion propulsion) {
		
		this.propulsion = propulsion;
		
	}
	
	protected abstract void  performFlyingWithPropulsion();

}
