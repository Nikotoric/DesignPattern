package calculator;

public class AddStrategy implements CalculationStrategy {

	public AddStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculation(float num1, float num2) {
		return num1 + num2;
	}

}
