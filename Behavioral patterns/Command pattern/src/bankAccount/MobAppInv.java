package bankAccount;

import java.util.Deque;
import java.util.LinkedList;

public class MobAppInv {

	private PaymentServiceInt payment;
	private Deque<PaymentServiceInt> undoStack;
	private Deque<PaymentServiceInt> redoStack;

	public MobAppInv() {
		undoStack = new LinkedList<PaymentServiceInt>();
		redoStack = new LinkedList<PaymentServiceInt>();
	}

	public void performTransaction(PaymentServiceInt trans) {
		trans.execute();
		undoStack.offerLast(trans);
	}

	public void undoLastTransaction() {
		if (!undoStack.isEmpty()) {
			PaymentServiceInt previousTrans = undoStack.pollLast();
			redoStack.offerLast(previousTrans);
			System.out.println("\n<<<<<<<<<<<<<<<<<<<< Undo last transaction >>>>>>>>>>>>>>>>>>>>");
			previousTrans.undo();
		} else {
			System.out.println("Nothing to UNDO!!!");
		}
	}

	public void redoLastTransaction() {
		if (!redoStack.isEmpty()) {
			PaymentServiceInt previousTransaction = redoStack.pollLast();
			undoStack.offerLast(previousTransaction);
			System.out.println("\n<<<<<<<<<<<<<<<<<<<< Redo last transaction >>>>>>>>>>>>>>>>>>>>");
			previousTransaction.redo();
		} else {
			System.out.println("Nothing for REDO!!!");
		}
	}

}
