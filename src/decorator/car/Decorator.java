package decorator.car;

abstract class Decorator implements InterfaceComponent {
	protected InterfaceComponent component;

	public Decorator(InterfaceComponent c) {
		component = c;
	}

	public int getPrice() {
		return component.getPrice();
	}
}
