package payingSimulation;

public class Cash implements PayingStrategy {

	@Override
	public void pay() {
		System.out.println("Paying with cash money ..");
	}

}