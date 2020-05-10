package calculator;

public class MultiplyStrategy implements CalculationStrategy {

	public MultiplyStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculation(float num1, float num2) {
		return num1 * num2;
	}

}
