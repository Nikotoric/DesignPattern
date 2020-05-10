package food;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(FoodInt newFood) {
		super(newFood);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return super.prepareFood() + "\nFried rice and manchurian";
	}
	
	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return super.foodPrice() + 65.0;
	}

}
