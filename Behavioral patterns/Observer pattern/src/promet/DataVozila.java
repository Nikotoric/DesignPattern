package promet;

import java.util.ArrayList;
import java.util.Random;

public class DataVozila implements RegistrationInt {

	private ArrayList<ChangingState> lista;
	private StanjeCesta stanjeCesta;

	public DataVozila() {
		lista = new ArrayList<ChangingState>();
	}

	@Override
	public void add(ChangingState changingState) {
		lista.add(changingState);

	}

	@Override
	public void remove(ChangingState changingState) {
		if (lista.contains(changingState)) {
			lista.remove(changingState);
		}
	}

	@Override
	public void notifAll() {

		for (ChangingState changingState : lista) {
			changingState.changeState();
			randomChoosing();
			System.out.println("\n");
		}
	}

	public void randomChoosing() {
		StanjeCesta[] stanjeCestas = StanjeCesta.values();
		Random generator = new Random();
		stanjeCesta = stanjeCestas[generator.nextInt(stanjeCestas.length)];
		System.out.println(stanjeCesta);
	}

}
