package coupling;

public class Client {
	
	public static void main(String[] args) {
		NewTranslator nt = new NewTranslator();
		nt.setLangTranslator(new EnglishTransl());
		nt.performTranslation();
	}

}
