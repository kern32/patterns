package memento.game;

public class Player implements IOriginator { 
	private int health;

	public Player() {
		health = 100;
	}

	public void getHurt(int hurt) {
		health -= hurt;
	}

	public void getCure(int cure) {
		health += cure;
	}

	public void printPulse() {
		if (health > 70)
			System.out.println("Green");
		if (health <= 70 && health > 40)
			System.out.println("Yellow");
		if (health <= 40)
			System.out.println("Red");
	}

	public void setMemento(Memento memento) {
		health = memento.getState();
	}

	public Memento getMemento() {
		return new Memento(health);
	}
}
