package themeRenderer;

public class Theme1Factory implements AbsFactoryTheme {

	@Override
	public ScrollBar createScrollBar() {
		Theme1Scrollbar t1Sb = new Theme1Scrollbar();
		return t1Sb;
	}

	@Override
	public MenuBar createMenuBar() {
		Theme1Menubar t1Mb = new Theme1Menubar();
		return t1Mb;
	}

	@Override
	public StatusBar createStatusBar() {
		Theme1Statusbar t1Sb = new Theme1Statusbar();
		return t1Sb;
	}

	@Override
	public ToolBar createToolBar() {
		Theme1Toolbar t1T = new Theme1Toolbar();
		return t1T;
	}

	@Override
	public Window createWindow() {
		Theme1Window t1W = new Theme1Window();
		return t1W;
	}

}
