package fileParser;

public class JSONBatchProcessor extends BatchProcessor {
	@Override
	public FileParser createFileParser() {
		return new JSONFileParser();
	}

}
