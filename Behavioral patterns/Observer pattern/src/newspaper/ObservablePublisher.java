package newspaper;

public interface ObservablePublisher {

	public void add(ObserversSubscribers obs);

	public void remove(ObserversSubscribers obs);

	public void notifyObs();

	public void mainLogic();

}
