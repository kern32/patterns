package decorator.car;

public class Main {

	public static void main(String[] s) {
		Decorator commonprice = new DecoratorNavigator(new DecoratorTitanDisk(new Car()));
		System.out.println(commonprice.getPrice());
	}
}
