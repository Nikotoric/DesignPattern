package payingSimulation;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("How would you like to pay?");

		System.out.println(
				"You can choose:\n ~ 1 - with cash\n ~ 2 - with credit card\n ~ 3 - with PayPal\n ~ 4 - with Bitcoin");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		paying(choice);
		input.close();

	}

	public static void paying(int pay) {

		Payable payable = new Payable();

		switch (pay) {
		case 1:
			payable.setPs(new Cash());
			break;
		case 2:
			payable.setPs(new Card());
			break;
		case 3:
			payable.setPs(new PayPal());
			break;
		case 4:
			payable.setPs(new Bitcoin());
			break;
		default:
			System.out.println("You typed the wrong payment method ... ");
		}

		if (pay == 1 || pay == 2 || pay == 3 || pay == 4) {
			payable.performPay();
		} else {
			System.out.println("The end");
		}

	}

}
