package memento.game;

class GameUtils {
	private Memento memento;

	public void saveState(IOriginator originator) {
		if (originator == null)
			throw new NullPointerException("originator is null");

		memento = originator.getMemento();
		System.out.println("Save state");
	}

	public void loadState(IOriginator originator) {
		if (originator == null)
			throw new NullPointerException("originator is null");
		if (memento == null)
			throw new NullPointerException("memento is null");

		originator.setMemento(memento);
		System.out.println("Load State");
	}
}
