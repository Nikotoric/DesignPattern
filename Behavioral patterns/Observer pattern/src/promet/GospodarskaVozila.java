package promet;

public class GospodarskaVozila implements ChangingState {

	private static int cnt = 10;
	private int id;
	private String name;

	public GospodarskaVozila() {
		this.id = cnt;
		name = this.getClass().getSimpleName() + "_" + id;
		cnt++;
	}

	@Override
	public String toString() {
		return "GospodarskaVozila [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void changeState() {
		display();
	}

	
	public void display() {
		System.out.println(toString());
	}
}
