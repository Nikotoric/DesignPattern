package newspaper;

public class ConcreteSubscriber2 implements ObserversSubscribers {

	NewspaperMonth month;
	NewspaperQuart quart;

	private String text;

	public void setObservable1(NewspaperMonth news) {
		this.month = news;
		news.add(this);

	}

	public void setObservable2(NewspaperQuart quart) {
		this.quart = quart;
		quart.add(this);

	}

	@Override
	public void update(String text) {
		this.text = text;
		display();

	}

	public void display() {
		System.out.println("Pretplatitelj: 2");
		System.out.println(text);

	}

}
