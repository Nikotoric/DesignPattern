package movingApp;

import java.util.Random;

public class Dog extends AbsEntity {

	private static int cnt = 100;

	public Dog(String name) {
		this.name = name;
		this.id = cnt;
		cnt++;
		// printStatus();
	}

	@Override
	public void moving() {

		Random randomPosition = new Random();
		Random randomSpeed = new Random();
		int posNum = randomPosition.nextInt(9999);
		String position = posNum + "qay";
		setMovingSpeed(randomSpeed.nextDouble());

		System.out.println(this.getClass().getSimpleName() + "_" + name);
		System.out.println("Moving from -> " + position);
		System.out.println("Moving speed -> " + getSpeed());
		System.out.println("Moving in direction -> " + getDirection());

	}

	@Override
	public void renew() {
		System.out.println("Only if you have good food.");
	}

	@Override
	public void avoidObstacle() {
		System.out.println("Avoiding obstacle.");
	}

	@Override
	public void saySomething() {
		System.out.println("Say something im giving up on you");
	}

	@Override
	public void stop() {
		System.out.println("Stop moving...");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", description=" + this.getClass().getSimpleName() + ", id=" + id + "]";
	}

	@Override
	public void printStatus() {
		System.out.println(toString());
	}

}
