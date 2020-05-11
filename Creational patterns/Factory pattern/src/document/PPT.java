package document;

public class PPT extends AbsDocument {

	@Override
	void open() {
		System.out.println("Opening document ...\n... *.ppt document...");

	}

	@Override
	void close() {
		System.out.println("Closing document...");
	}

	@Override
	void save() {
		System.out.println("Saving *.ppt document...");
	}

}
