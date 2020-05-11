package guiFactory;

public class WinGUIfactory implements GUIFactory {

	@Override
	public ButtonInt createButton() {
		WinBtn wBtn = new WinBtn();
		return wBtn;
	}

	@Override
	public CheckboxInt createCheckbox() {
		WinChcBox wBox = new WinChcBox();
		return wBox;
	}

}
