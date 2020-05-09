package coupling;

public class NewTranslator {
	
	private LanguageInt lt;
	
	public void setLangTranslator(LanguageInt lt) {
		this.lt = lt;
	}
	
	public void performTranslation() {
		lt.translate();
	}

}
