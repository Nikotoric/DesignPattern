package fileParser;

import java.io.File;
import java.util.List;

public interface FileParser {
	
	public List<Record> parse(File file) ;

}
