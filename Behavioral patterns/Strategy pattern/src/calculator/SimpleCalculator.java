package calculator;

public class SimpleCalculator extends Calculator {

	private float num;

	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float performCalculation(float num1, float num2) {
		num = strategy.calculation(num1, num2);
		return num;
	}

}
