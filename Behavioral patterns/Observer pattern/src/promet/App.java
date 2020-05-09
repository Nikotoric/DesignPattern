package promet;

public class App {

	public static void main(String[] args) {

		DataVozila dataVozila = new DataVozila();
		OsobnaVozila prvoOsobno = new OsobnaVozila();
		OsobnaVozila drugoOsobno = new OsobnaVozila();
		GospodarskaVozila prvoGospodarsko = new GospodarskaVozila();
		GospodarskaVozila drugoGospodarsko = new GospodarskaVozila();

		System.out.println("************************* ALL *************************");
		System.out.println(prvoOsobno.toString());
		System.out.println(drugoOsobno.toString());
		System.out.println(prvoGospodarsko.toString());
		System.out.println(drugoGospodarsko.toString());

		System.out.println("\n************************* 1st message *************************");
		dataVozila.add(prvoOsobno);
		dataVozila.add(drugoOsobno);
		dataVozila.add(drugoGospodarsko);
		dataVozila.notifAll();

		System.out.println("************************* 2nd message *************************");
		dataVozila.add(prvoGospodarsko);
		dataVozila.remove(drugoGospodarsko);
		dataVozila.notifAll();
		
		System.out.println("************************* 3rd message *************************");
		dataVozila.remove(drugoOsobno);
		OsobnaVozila treceOsobno = new OsobnaVozila();
		dataVozila.add(treceOsobno);
		dataVozila.notifAll();

	}

}
