package builder.house;

public class Director {
	private Builder builder;

	public Director(int level) {
		if (level > 1)// Выбираем строителя
			builder = new MultiStoreyBuilderImpl();
		else
			builder = new RanchBuilderImpl();
	}
	public House buildHouse() {
		return builder.buildHouse(); // заставляем строителя строить нам дом
	}
}
