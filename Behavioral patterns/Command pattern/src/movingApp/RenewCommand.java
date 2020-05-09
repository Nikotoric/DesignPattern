package movingApp;

public class RenewCommand implements OperCommand {

	private AbsEntity absEntity;

	public RenewCommand(AbsEntity absEntity) {

		this.absEntity = absEntity;

	}

	@Override
	public void execute() {

		System.out.println("-----> " + getClass().getSimpleName());
		absEntity.renew();
		System.out.println("***********************************************");
	}

	@Override
	public void undo() {

	}

	@Override
	public void redo() {

	}

}
