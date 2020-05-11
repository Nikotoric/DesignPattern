package document;

public class DOC extends AbsDocument {

	@Override
	void open() {
		System.out.println("Opening document ...\n... *.doc document...");
	}

	@Override
	void close() {
		System.out.println("Closing document");
	}

	@Override
	void save() {
		System.out.println("Saving *.doc document...");
	}

}
