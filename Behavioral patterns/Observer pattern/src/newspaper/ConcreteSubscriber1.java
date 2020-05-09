package newspaper;

public class ConcreteSubscriber1 implements ObserversSubscribers {

	NewspaperMonth month;
	NewspaperQuart quart;

	private String text;

	public void setObservable(NewspaperMonth news) {
		this.month = news;
		news.add(this);

	}

	public void setObservable(NewspaperQuart quart) {
		this.quart = quart;
		quart.add(this);

	}

	@Override
	public void update(String text) {
		this.text = text;
		display();

	}

	public void display() {
		System.out.println("Pretplatitelj: 1");
		System.out.println(text);

	}

}
