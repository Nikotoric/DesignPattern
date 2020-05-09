package movingApp;

public class StopCommand implements OperCommand {

	private AbsEntity absEntity;

	public StopCommand(AbsEntity absEntity) {

		this.absEntity = absEntity;

	}

	@Override
	public void execute() {

		System.out.println("-----> " + getClass().getSimpleName());
		absEntity.stop();
		System.out.println("***********************************************");
	}

	@Override
	public void undo() {

	}

	@Override
	public void redo() {

	}

}