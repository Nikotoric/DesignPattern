package document;

public class PPTplugIn extends WebBrowser {

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

		if (url.equals("ppt")) {
			document = new PPT();
		} else {
			System.out.println("Not supported format ...");
		}

		return document;

	}

}
