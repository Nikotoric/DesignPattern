package payingSimulation;

public abstract class Pay {

	PayingStrategy ps;

	public void display() {

	}

	public abstract void performPay();

	public void setPs(PayingStrategy ps) {
		this.ps = ps;
	}

}
