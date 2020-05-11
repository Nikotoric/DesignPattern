package themeRenderer;

public class Client {

	private AbsFactoryTheme abs;
	private ToolBar toolbar;
	private ScrollBar scrollBar;
	private MenuBar menuBar;
	private StatusBar statusBar;
	private Window window;

	public Client(AbsFactoryTheme abs) {
		this.abs = abs;
		createElements();
	}

	public void createElements() {
		menuBar = abs.createMenuBar();
		scrollBar = abs.createScrollBar();
		statusBar = abs.createStatusBar();
		toolbar = abs.createToolBar();
		window = abs.createWindow();

		output();
	}

	public void output() {
		menuBar.output();
		scrollBar.output();
		statusBar.output();
		toolbar.output();
		window.output();
	}
}
