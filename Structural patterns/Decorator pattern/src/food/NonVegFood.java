package food;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(FoodInt newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + "\nRoasted chicken and chicken curry";
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 150.0;
	}
}
