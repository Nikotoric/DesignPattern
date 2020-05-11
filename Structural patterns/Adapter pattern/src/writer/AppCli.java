package writer;

public class AppCli {
	
	public static void main(String[] args) {
		
		NovelWriter nw = new NovelWriter("Famous novel writer");
		nw.writeNovel(1);
		nw.writeNovel(3);
		WriterAdapter wa = new WriterAdapter(new OldNovelist("SF novel writer"));
		wa.writeNovel(10);
	}

}
