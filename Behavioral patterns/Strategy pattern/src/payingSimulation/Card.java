package payingSimulation;

public class Card implements PayingStrategy {

	@Override
	public void pay() {
		System.out.println("Paying with credit card ..");
	}

}
