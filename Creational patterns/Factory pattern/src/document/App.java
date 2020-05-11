package document;

import java.util.concurrent.ThreadLocalRandom;

public class App {

	public static void main(String[] args) throws InterruptedException {

		int key = ThreadLocalRandom.current().nextInt(1, 5);
		switch (key) {
		case 1:

			WebBrowser wb_doc = new DOCplugIn();

			wb_doc.fetchDocument("doc");
			wb_doc.openDocument();
			Thread.sleep(2000);
			wb_doc.saveDocument();
			Thread.sleep(2000);
			wb_doc.closeDocument();

			break;

		case 2:

			WebBrowser wb_pdf = new PDFplugIn();
			wb_pdf.fetchDocument("pdf");
			wb_pdf.openDocument();
			Thread.sleep(2000);
			wb_pdf.saveDocument();
			Thread.sleep(2000);
			wb_pdf.closeDocument();

			break;

		case 3:

			WebBrowser wb_ppt = new PPTplugIn();
			wb_ppt.fetchDocument("ppt");
			wb_ppt.openDocument();
			Thread.sleep(2000);
			wb_ppt.saveDocument();
			Thread.sleep(2000);
			wb_ppt.closeDocument();

			break;

		case 4:

			System.out.println("Opening basic html document..");

		default:
			break;
		}

	}

}