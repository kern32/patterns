package factoryMethod.human;

class Girl implements Human{
	 
	@Override
	public void talk() {
		System.out.println("Girl is talking...");	
	}
 
	@Override
	public void walk() {
		System.out.println("Girl is walking...");
	}
}
