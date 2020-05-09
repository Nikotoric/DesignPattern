package promet;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum StanjeCesta {

	GranicniZastoj {
		public String toString() {
			List<String> zastoj = Arrays.asList("Zastoj na GP Gori�an", "Zastoj na GP Dvor", "Zastoj na GP Bregana",
					"Zastoj na GP Macelj", "Zastoj na GP Kamensko");
			Random r = new Random();
			int randomitem = r.nextInt(zastoj.size());
			return zastoj.get(randomitem);
		}
	},

	PrekidZbogVremena {
		public String toString() {
			List<String> vrijeme = Arrays.asList("Prekid prometa na dionici AA zbog poledice",
					"Prekid prometa zbog orkanske bure na dionici DD autoputa AP1",
					"Prekid prometa zbog poplave na nn km ceste CC");
			Random r = new Random();
			int randomitem = r.nextInt(vrijeme.size());
			return vrijeme.get(randomitem);
		}
	},

	PrekidGu�vaPromet {
		public String toString() {
			List<String> guzva = Arrays.asList("Prekid prometa na �upanijskoj cesti �C zbog prometnog �epa",
					"Prekid prometa na dionici D1 ceste LC1 zbog gu�ve u prometu",
					"Prekid prometa na cesti C2 zbog kvara na teretnom vozilu",
					"Prekid prometa na cesti C22 zbog prolaska specijalnog tereta - mogu�e ve�e gu�ve");
			Random r = new Random();
			int randomitem = r.nextInt(guzva.size());
			return guzva.get(randomitem);
		}
	},
	
	RadoviNaCesti{
		public String toString() {
			List<String> radovi = Arrays.asList("Radovi na cesti R1", 
					"Radovi na cesti R23", "Radovi na cesti C45",
					"Radovi na cesti AC2 - preusmjeravanje prometa",
					"Zbog radova na lokalnoj cesti LC8 prometuje se zaobilaznim smjerom");
			Random r = new Random();
			int randomitem = r.nextInt(radovi.size());
			return radovi.get(randomitem);
		}
	}, 
	
	UpozorenjeZbogPoledice{
		public String toString() {
			List<String> poledica = Arrays.asList("Upozerenje A1", 
					"Upozerenje A2", "Upozerenje A3",
					"Upozerenje A4", "Upozerenje A5");
			Random r = new Random();
			int randomitem = r.nextInt(poledica.size());
			return poledica.get(randomitem);
		}
	};

}
