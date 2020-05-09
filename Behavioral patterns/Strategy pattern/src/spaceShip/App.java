package spaceShip;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		
		ArrayList<AbsSpaceShipClass> list = new ArrayList<>();
		
		EnterpriseClassSpaceShip enterprise = new EnterpriseClassSpaceShip("Pickard", new IonPropulsion());
//		enterprise.performFlyingWithPropulsion();
		
		DiscoveryClassSpaceShip discovery = new DiscoveryClassSpaceShip("Janeway", new WarpPropulsion());
//		discovery.performFlyingWithPropulsion();

		
		list.add(enterprise);
		list.add(discovery);
		
		for (AbsSpaceShipClass shipClass : list) {
			shipClass.performFlyingWithPropulsion();
		}
		
		System.out.println("\nAfter changing propulsion for - " + discovery.getClass().getSimpleName());
		discovery.setPropulsion(new TransWarpPropulsion());

		
		for (AbsSpaceShipClass shipClass : list) {
			shipClass.performFlyingWithPropulsion();
		}	

	}

}
