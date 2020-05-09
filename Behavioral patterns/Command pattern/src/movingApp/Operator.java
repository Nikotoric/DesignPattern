package movingApp;

import java.util.Stack;

public class Operator {

	private final Stack<OperCommand> undoCommand, redoCommand;
	private OperCommand command;

	public Operator() {

		undoCommand = new Stack<>();
		redoCommand = new Stack<>();

	}

	public void executeCommand(OperCommand oc) {

		undoCommand.push(oc);
		command.execute();

	}

	public OperCommand getCommand() {
		return command;
	}

	public void setCommand(OperCommand command) {
		this.command = command;
	}

	public void undoCommand() {

		System.out.println("<<< UNDO COMMAND >>>");
		if (!undoCommand.isEmpty()) {
			OperCommand oc = undoCommand.pop();
			oc.undo();
			redoCommand.push(oc);
		} else {
			System.out.println("*** Nothing to undo ***");
		}
	}

	public void printUndo() {
		System.out.println("--- PRINTING UNDO COMMANDS ---");
		for (OperCommand oc : undoCommand) {
			System.out.println(oc.toString());
		}
	}

	public void redoCommand() {

		System.out.println("<<< REDO >>>");
		OperCommand cmd = redoCommand.pop();
		cmd.execute();
		undoCommand.push(cmd);

	}

	public void printRedo() {
		System.out.println("--- PRINTING REDO COMMANDS ---");
		for (OperCommand oc : redoCommand) {
			System.out.println(oc.toString());
		}
	}

}
