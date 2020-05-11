package themeRenderer;

public class Theme3Factory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		Theme3Scrollbar t3Sb = new Theme3Scrollbar();
		return t3Sb;
	}

	@Override
	public MenuBar createMenuBar() {
		Theme3Menubar t3Mb = new Theme3Menubar();
		return t3Mb;
	}

	@Override
	public StatusBar createStatusBar() {
		Theme3Statusbar t3Sb = new Theme3Statusbar();
		return t3Sb;
	}

	@Override
	public ToolBar createToolBar() {
		Theme3Toolbar t3T = new Theme3Toolbar();
		return t3T;
	}

	@Override
	public Window createWindow() {
		Theme3Window t3W = new Theme3Window();
		return t3W;
	}

}