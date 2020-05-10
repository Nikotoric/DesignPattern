package food;

public class Food implements FoodInt {

	@Override
	public String prepareFood() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	@Override
	public double foodPrice() {
		// TODO Auto-generated method stub
		return 50.0;
	}

}
