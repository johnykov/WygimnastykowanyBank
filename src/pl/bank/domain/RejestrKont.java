package pl.bank.domain;

import java.util.ArrayList;
import java.util.List;

public class RejestrKont {

	private static final List<Konto> rejestrKont = new ArrayList<Konto>();
	private static final RejestrKont INSTANCE = new RejestrKont();

	// singleton implementacja
	private RejestrKont() {
		if (INSTANCE != null) {
			throw new IllegalStateException("Already instantiated");
		}
		rejestrKont.add(new Konto(new NumerKonta(1)));
		rejestrKont.add(new Konto(new NumerKonta(2)));
	}

	public static RejestrKont getInstance() {
		return INSTANCE;
	}

	public static void dodajKonto(Konto noweKonto) {
		rejestrKont.add(noweKonto);
	}

	public static List<Konto> pokazKonta() {
		return rejestrKont;
	}

	public static Konto zwrocKonto(int i) {
		return rejestrKont.get(i);
	}

}
