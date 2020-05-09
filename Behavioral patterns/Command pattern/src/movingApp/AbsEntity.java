package movingApp;

public abstract class AbsEntity {

	protected String name, description;
	protected static int num;
	protected int id;
	private double speed;
	private String position, direction;

	public AbsEntity() {
		// TODO Auto-generated constructor stub
	}

	public abstract void moving();

	public abstract void renew();

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public double getSpeed() {
		return speed;
	}

	public void setMovingSpeed(double speed) {
		this.speed = speed;
	}

	public abstract void avoidObstacle();

	public abstract void saySomething();

	public abstract void stop();

	public abstract void printStatus();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
