package strategy.knight;

public class Knight {
	Quest quest;

	public Knight() {
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	public void execute() {
		quest.execute();
	}
}
