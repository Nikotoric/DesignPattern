package guiFactory;

public class MACGUIfactory implements GUIFactory {

	@Override
	public ButtonInt createButton() {
		MacBtn mBtn = new MacBtn();
		return mBtn;
	}

	@Override
	public CheckboxInt createCheckbox() {
		MacChcBox mBox = new MacChcBox();
		return mBox;
	}

}
