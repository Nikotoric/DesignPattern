package newspaper;

public class App {

	public static void main(String[] args) {

		NewspaperMonth newspaperMonth = new NewspaperMonth();
		NewspaperQuart newspaperQuart = new NewspaperQuart();

		ConcreteSubscriber1 cs1 = new ConcreteSubscriber1();
		ConcreteSubscriber2 cs2 = new ConcreteSubscriber2();

		cs1.setObservable(newspaperMonth);
		cs1.setObservable(newspaperQuart);

		cs2.setObservable1(newspaperMonth);
		cs2.setObservable2(newspaperQuart);

		newspaperMonth.mainLogic();
		newspaperQuart.mainLogic();

	}

}
