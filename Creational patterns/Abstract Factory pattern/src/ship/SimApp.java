package ship;

import ship.Simulator.ShipFactoryCreator;
import ship.Simulator.ShipFactoryCreator.ShipType;

public class SimApp {

	public static void main(String[] args) {
		Simulator simulator = new Simulator("Jack", "Pearl", 25);
		simulator.runSimulation(ShipFactoryCreator.createShipFactory(ShipType.PIRATE));
	}
}
