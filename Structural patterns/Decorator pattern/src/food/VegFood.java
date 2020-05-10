package food;

public class VegFood extends FoodDecorator {

	public VegFood(FoodInt newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + "\nToffu, Seaweed, ..";
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 150.0;
	}
}
