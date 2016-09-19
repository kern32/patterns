package builder.house;

public class House {
	private int stores; // количество этажей

	public House() {
		stores = 0; // дом не построен, 0 этажей
	}
	// в процессе строительства мы будем увеличивать количество этажей
	public void setStores(int newLevel) {
		log("setting stores to: " + newLevel);
		stores = newLevel;
	}
	public int getStores() {
		return stores;
	}
	public void buildBase() {// Построить фундамент
		log("Build base");
	}
	public void buildFloor() {// Построить пол
		log("Build floor");
	}
	public void buildRoof() {// Построить крышу
		log("Build roof");
	}
	public void buildWalls(Window window) {// Построить стены
		log("Build walls with window: " + window.getWindowType());
	}
	private void log(String msg) {
		System.out.println(msg);
	}
}
