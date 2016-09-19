package decorator.car;

class DecoratorTitanDisk extends Decorator {
	public DecoratorTitanDisk(InterfaceComponent c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 2000;
	}

	public void getNameParameter() {
		System.out.println("#TitanDisk");
	}
}
