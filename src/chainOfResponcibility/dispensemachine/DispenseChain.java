package chainOfResponcibility.dispensemachine;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
