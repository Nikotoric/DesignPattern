package document;

public class PDF extends AbsDocument {

	@Override
	void open() {
		System.out.println("Opening document ...\n... *.pdf document...");

	}

	@Override
	void close() {
		System.out.println("Closing document...");
	}

	@Override
	void save() {
		System.out.println("Saving *.pdf document...");
	}

}
