package document;

public class DOCplugIn extends WebBrowser {

	AbsDocument document;

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

		if (url.equals("doc")) {
			document = new DOC();
		} else {
			System.out.println("Not supported format ...");
		}

		return document;

	}

}
