package decorator.car;

class DecoratorNavigator extends Decorator {
	public DecoratorNavigator(InterfaceComponent c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 300;
	}

	public void getNameParameter() {
		System.out.println("#Navigator");
	}
}
