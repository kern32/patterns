package builder.house;

public class MultiStoreyBuilderImpl extends Builder {
	public MultiStoreyBuilderImpl() {
		house = new House();
	}
	@Override
	public House buildHouse() {
		house.buildBase();// фундамент
		house.buildFloor();// пол 1 этажа
		Window complexWindow = new ComplexWindow();
		house.buildWalls(complexWindow); // стены
		house.buildFloor(); // пол второго этажа
		house.setStores(1); // 1 этаж готов
		complexWindow = new ComplexWindow();
		house.buildWalls(complexWindow); // стены
		house.buildRoof(); // крыша
		house.setStores(2); // 2 этаж готов
		return house; // возвращаем готовый объект
	}
}
