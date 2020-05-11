package fileParser;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {
	
	public final void processBatch(File file) {
//		String nme = file.getName();
//		String ext = getFileExtension(nme);
//		System.out.println(nme);
//		System.out.println(ext);
		FileParser parser = null;
		System.out.println("\n<<<<<<<<<<<<<<<<<<<<< Parsing some file >>>>>>>>>>>>>>>>>>>>>");
		parser = createFileParser();
		List<Record> records = parser.parse(file);
		processRecords(records);
		writeSummary();
		closeFile(file);
	}
	
	public abstract FileParser createFileParser();
	
//	private String getFileExtension(String file) {
//		if(file.contains(".")) {
//			String ext = file.substring(file.lastIndexOf(".") + 1);
//			return ext;
//		} else {
//			return null;
//		}
//	}
//	
	private void processRecords(List<Record> records) {
		System.out.println("Processing all records...");
	}
	
	private void writeSummary() {
		System.out.println("Writing summary related to parsing process ...");
	}
	
	private void closeFile(File file) {
		System.out.println("Closed file -> " + file.toString());
	}

}
