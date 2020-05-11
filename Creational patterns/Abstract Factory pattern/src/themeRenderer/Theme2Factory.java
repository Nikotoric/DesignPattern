package themeRenderer;

public class Theme2Factory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		Theme2Scrollbar t2Sb = new Theme2Scrollbar();
		return t2Sb;
	}

	@Override
	public MenuBar createMenuBar() {
		Theme2Menubar t2Mb = new Theme2Menubar();
		return t2Mb;
	}

	@Override
	public StatusBar createStatusBar() {
		Theme2Statusbar t2Sb = new Theme2Statusbar();
		return t2Sb;
	}

	@Override
	public ToolBar createToolBar() {
		Theme2Toolbar t2T = new Theme2Toolbar();
		return t2T;
	}

	@Override
	public Window createWindow() {
		Theme2Window t2W = new Theme2Window();
		return t2W;
	}

}
