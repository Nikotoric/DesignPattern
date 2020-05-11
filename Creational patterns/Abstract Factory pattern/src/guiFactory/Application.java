package guiFactory;

public class Application {

	private GUIFactory factory;
	private ButtonInt btn;
	private CheckboxInt chb;

	public Application(GUIFactory factory) {
		this.factory = factory;
	}

	public void createUI() {
		btn = factory.createButton();
		chb = factory.createCheckbox();
	}

	public void name() {
		
	} void paint() {
		btn.paint();
		chb.paint();
	}
	

}
