package food;

public abstract class FoodDecorator implements FoodInt {
	
	private FoodInt newFood;
	
	public FoodDecorator(FoodInt newFood) {
		this.newFood = newFood;
	}
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return newFood.prepareFood();
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return newFood.foodPrice();
	}

}
