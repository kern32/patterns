package chainOfResponcibility.dispensemachine;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		atmDispenser.c1.dispense(new Currency(230));
	}
}
