package calculator;

public abstract class Calculator {

	CalculationStrategy strategy;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public void display(float num) {
		System.out.println(num);
	}

	public abstract float performCalculation(float num1, float num2);

	public void setStrategy(CalculationStrategy cs) {
		this.strategy = cs;
	}

}
