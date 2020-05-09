package coupling;

public class Translator {

	private int choice;

	public void setChoice(int chc) {
		this.choice = chc;
		performTranslation();
	}

	public void performTranslation() {
		switch (choice) {
		case 1:

			FranceTranslator ft = new FranceTranslator();
			ft.translate();

			break;

		case 2:

			EnglishTranslator et = new EnglishTranslator();
			et.translateText();

			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

}
