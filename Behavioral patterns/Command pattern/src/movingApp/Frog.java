package movingApp;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Frog extends AbsEntity {

	private static int cnt = 300;

	public Frog(String name) {
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
		String position = posNum + "rfv";
		setMovingSpeed(randomSpeed.nextDouble());

		System.out.println(this.getClass().getSimpleName() + "_" + name);
		System.out.println("Moving from -> " + position);
		System.out.println("Moving speed -> " + getSpeed());
		System.out.println("Moving in direction -> " + getDirection());

	}

	@Override
	public void renew() {
		System.out.println("Energy level: " + ThreadLocalRandom.current().nextInt(20, 55));
		System.out.println("Connect me to the power source!");
		System.out.println("New energy level: " + ThreadLocalRandom.current().nextInt(60, 100));
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
		return "Frog [name=" + name + ", description=" + this.getClass().getSimpleName() + ", id=" + id + "]";
	}

	@Override
	public void printStatus() {
		System.out.println(toString());
	}

}