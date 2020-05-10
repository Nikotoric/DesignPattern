package payingSimulation;

public class PayPal implements PayingStrategy {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal account ..");
	}

}
