package themeRenderer;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		System.out.println("*************************");
		System.out.println("Choose theme: ");
		System.out.println("1 - Light visual theme\n2 - Solarized dark theme\n3 - Dark theme");
		System.out.println("*************************");
		System.out.println("Enter your choice: ");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice == 1) {
			Client cl1 = new Client(new Theme1Factory());
		} else if (choice == 2) {
			Client cl2 = new Client(new Theme2Factory());
		} else if (choice == 3) {
			Client cl3 = new Client(new Theme3Factory());
		} else {
			System.out.println("You enterred wrong theme number. Please run program again.");
		}

		sc.close();
	}

}
