package document;

public class PDFplugIn extends WebBrowser {

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

		if (url.equals("pdf")) {
			document = new PDF();
		} else {
			System.out.println("Not supported format ...");
		}

		return document;
	}

}
