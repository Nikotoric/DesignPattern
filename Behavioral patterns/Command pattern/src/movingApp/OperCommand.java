package movingApp;

public interface OperCommand {
	
	public void execute();
	
	public void undo();
	
	public void redo();

}
