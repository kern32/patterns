package decorator.car;

class DecoratorClimatControl extends Decorator {
	public DecoratorClimatControl(InterfaceComponent c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 1500;
	}

	public void getNameParameter() {
		System.out.println("#ClimatControl");
	}
}
