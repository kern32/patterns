package memento.game;

public class Main {

	public static void main(String args[]) {
		GameUtils gameUtils = new GameUtils();
		Player player = new Player();

		player.getHurt(20); // нанесено урон 20
		player.getHurt(30); // нанесено урон 30
		player.getHurt(20); // нанесено урон 20
		player.printPulse();// печатаем пульс

		// сохраняем состояние
		gameUtils.saveState(player);

		player.getCure(30); // принимем лекарство
		player.printPulse();// печатаем пульс

		// восстанавливаем состояние
		gameUtils.loadState(player);

		player.printPulse(); // печатаем пульс
	}
}
