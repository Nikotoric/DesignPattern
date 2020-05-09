package newspaper;

import java.util.ArrayList;

public class NewspaperQuart implements ObservablePublisher {

	private ArrayList<ObserversSubscribers> observers;
	private String news;

	public NewspaperQuart() {

		observers = new ArrayList<>();

	}

	@Override
	public void add(ObserversSubscribers obs) {
		observers.add(obs);
	}

	@Override
	public void remove(ObserversSubscribers obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObs() {
		for (ObserversSubscribers obs : observers) {
			obs.update(news);
		}
	}

	@Override
	public void mainLogic() {
		news = "Izasao je novi broj Kvartalnog magazina..";
		stateHasChanged();
	}

	public void stateHasChanged() {
		notifyObs();
	}

}
