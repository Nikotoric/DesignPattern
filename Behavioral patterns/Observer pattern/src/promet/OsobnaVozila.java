package promet;

public class OsobnaVozila implements ChangingState {

	private static int cnt = 1;
	private int id;
	private String name;

	public OsobnaVozila() {
		this.id = cnt;
		name = this.getClass().getSimpleName() + "_" + id;
		cnt++;
	}

	@Override
	public String toString() {
		return "OsobnaVozila [id=" + id + ", name=" + name + "]";
	}

	@Override
	public void changeState() {
		display();
	}

	
	public void display() {
		System.out.println(toString());
	}
}
