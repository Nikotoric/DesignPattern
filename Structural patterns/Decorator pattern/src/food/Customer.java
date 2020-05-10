package food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int choice;
	
		do {
			System.out.println("**********> FOOD MENU <**********");
			System.out.println(" 1. Vegetarian Food");
			System.out.println(" 2. Non-Vegetarian Food");
			System.out.println(" 3. Chinese Food");
			System.out.println(" 4. Exit");
			System.out.println("Please, enter your choice: ");
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:
				FoodInt f = new VegFood(new Food());
				System.out.println(f.prepareFood());
				System.out.println(f.foodPrice());
				break;
			case 2:
				FoodInt f1 = new NonVegFood(new Food());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
				break;
			case 3:
				FoodInt f2 = new ChineseFood(new Food());
				System.out.println(f2.prepareFood());
				System.out.println(f2.foodPrice());
				break;
			default:
				System.out.println("Other than these no food available");
				return;
			}
		
		} while(choice != 4);

	}

}
