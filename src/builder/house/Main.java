package builder.house;

public class Main {
	public static void main(String[] args) {
		log("building ranch house--->");
		Director director = new Director(1);
		House house = director.buildHouse();
		log("building multistorey house--->");
		director = new Director(2);
		house = director.buildHouse();
	}
	private static void log(String msg) {
		System.out.println(msg);
	}
}
