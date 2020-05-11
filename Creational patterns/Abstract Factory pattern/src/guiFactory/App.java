package guiFactory;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String ui;

		Scanner sc = new Scanner(System.in);
		Application app;

		System.out.println("Unesite:\n\t~ WIN ~ for Windows GUI  \n\t~ MAC ~ for MAC GUI");
		ui = sc.nextLine();

		if (ui.equals("WIN")) {
			app = new Application(new WinGUIfactory());
			app.createUI();
			app.paint();

		} else if (ui.equals("MAC")) {
			app = new Application(new MACGUIfactory());
			app.createUI();
			app.paint();

		}

		sc.close();

	}

}
