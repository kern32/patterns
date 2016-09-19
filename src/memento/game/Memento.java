package memento.game;

public class Memento {
	private int health;

	public Memento(int helth) {
		health = helth;
	}

	public int getState() {
		return health;
	}
}
