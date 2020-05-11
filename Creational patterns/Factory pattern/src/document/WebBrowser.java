package document;

public class WebBrowser implements AbsWebBrowser {

	public AbsDocument document;

	@Override
	public void openDocument() {
		document.open();
	}

	@Override
	public void closeDocument() {
		document.close();
	}

	@Override
	public void saveDocument() {
		document.save();
	}

	@Override
	public AbsDocument fetchDocument(String url) {
		return fetchDocument(url);

	}

}
