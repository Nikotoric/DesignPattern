package bankAccount;

public class Client {
	
	public static void main(String[] args) {
		
		float amnt = (float) 250.50;
		
		CheckingAccount chAcc = new CheckingAccount("John", 125);
		MobAppInv mobApp = new MobAppInv();
		mobApp.performTransaction(new DepositMoney(chAcc, amnt));
		
		mobApp.undoLastTransaction();
		mobApp.undoLastTransaction();
		mobApp.undoLastTransaction();
		mobApp.redoLastTransaction();
		
	}

}
