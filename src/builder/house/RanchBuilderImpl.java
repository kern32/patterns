package builder.house;

public class RanchBuilderImpl extends Builder {
	public RanchBuilderImpl() {
		house = new House();
	}

	@Override
	public House buildHouse() {
		house.buildBase(); // фундамент
		house.buildFloor(); // пол
		Window simpleWindow = new SimpleWindow(); // инициализируем простое окно
		house.buildWalls(simpleWindow); // строим стены
		house.buildRoof(); // крыша
		house.setStores(1); // готов 1 этаж
		return house; // Возвращаем собранный объект
	}
}
