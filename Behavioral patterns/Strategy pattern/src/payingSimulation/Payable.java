package payingSimulation;

public class Payable extends Pay {
	
	public Payable() {

	}

	@Override
	public void performPay() {
		ps.pay();
	}

}
