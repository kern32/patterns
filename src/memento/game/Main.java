package memento.game;

public class Main {

	public static void main(String args[]) {
		GameUtils gameUtils = new GameUtils();
		Player player = new Player();

		player.getHurt(20); // �������� ���� 20
		player.getHurt(30); // �������� ���� 30
		player.getHurt(20); // �������� ���� 20
		player.printPulse();// �������� �����

		// ��������� ���������
		gameUtils.saveState(player);

		player.getCure(30); // �������� ���������
		player.printPulse();// �������� �����

		// ��������������� ���������
		gameUtils.loadState(player);

		player.printPulse(); // �������� �����
	}
}
