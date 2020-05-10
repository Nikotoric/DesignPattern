package payingSimulation;

public class Bitcoin implements PayingStrategy {

	@Override
	public void pay() {
		System.out.println("Paying with Bitcoin ..");
	}

}
