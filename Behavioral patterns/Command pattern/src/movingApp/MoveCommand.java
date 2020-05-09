package movingApp;

public class MoveCommand implements OperCommand {

	private AbsEntity absEntity;

	public MoveCommand(AbsEntity absEntity) {

		this.absEntity = absEntity;

	}

	@Override
	public void execute() {
		
		System.out.println("-----> " + getClass().getSimpleName());
		absEntity.moving();
		System.out.println("***********************************************");
	}

	@Override
	public void undo() {

	}

	@Override
	public void redo() {

	}

}
