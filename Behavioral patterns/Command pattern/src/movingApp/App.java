package movingApp;

public class App {

	public static void main(String[] args) {

		Operator operator = new Operator();
		AbsEntity dog = new Dog("Floky");
		dog.setDirection("147yaq741");
		
		AbsEntity robot = new Robot("Robinho");
		robot.setDirection("258xsw852");
		
		AbsEntity frog = new Frog("Frogi");
		frog.setDirection("369vfr963");
		
		AbsEntity tiger = new Tiger("Tajger");
		tiger.setDirection("159cde951");

		MoveCommand moveDog = new MoveCommand(dog);
		RenewCommand renewDog = new RenewCommand(dog);
		StopCommand stopDog = new StopCommand(dog);
		
		MoveCommand moveRobot = new MoveCommand(robot);
		RenewCommand renewRobot = new RenewCommand(robot);
		StopCommand stopRobot = new StopCommand(robot);
		
		MoveCommand moveFrog = new MoveCommand(frog);
		RenewCommand renewFrog = new RenewCommand(frog);
		StopCommand stopFrog = new StopCommand(frog);
		
		MoveCommand moveTiger = new MoveCommand(tiger);
		RenewCommand renewTiger = new RenewCommand(tiger);
		StopCommand stopTiger = new StopCommand(tiger);

		dog.printStatus();
		operator.setCommand(moveDog);
		operator.executeCommand(moveDog);

		operator.setCommand(renewDog);
		operator.executeCommand(renewDog);
		
		operator.setCommand(stopDog);
		operator.executeCommand(stopDog);
		
		System.out.println();
		robot.printStatus();
		operator.setCommand(moveRobot);
		operator.executeCommand(moveRobot);

		operator.setCommand(renewRobot);
		operator.executeCommand(renewRobot);
		
		operator.setCommand(stopRobot);
		operator.executeCommand(stopRobot);
		
		System.out.println();
		frog.printStatus();
		operator.setCommand(moveFrog);
		operator.executeCommand(moveFrog);

		operator.setCommand(renewFrog);
		operator.executeCommand(renewFrog);
		
		operator.setCommand(stopFrog);
		operator.executeCommand(stopFrog);
		
		System.out.println();
		tiger.printStatus();
		operator.setCommand(moveTiger);
		operator.executeCommand(moveTiger);

		operator.setCommand(renewTiger);
		operator.executeCommand(renewTiger);
		
		operator.setCommand(stopTiger);
		operator.executeCommand(stopTiger);
		
		// print all undo commands
		operator.printUndo();
		System.out.println();
		
		// undo some last commands and after that printing undo commands
		operator.undoCommand();
		operator.undoCommand();
		operator.undoCommand();
		operator.undoCommand();
		System.out.println();
		operator.printUndo();

		// redo some last commands and printing redo commands
		operator.redoCommand();
		operator.redoCommand();
		operator.printRedo();
		
	}

}