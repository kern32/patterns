package chainOfResponcibility.levels;

class C extends Chain {
	public C(int threshold) {
		this.Threshold = threshold;
	}

	protected void writeMessage(String msg) {
		System.out.println("C: " + msg);
	}
}
