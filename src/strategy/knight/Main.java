package strategy.knight;

public class Main {
	public static void main(String[] args) {
		Knight knight = new Knight();
		knight.setQuest(new KillDragonQuest());
		knight.execute();
		knight.setQuest(new SavePrincess());
		knight.execute();
		knight.setQuest(new BecomeKing());
		knight.execute();
	}
}
