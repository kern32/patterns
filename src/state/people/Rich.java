package state.people;

class Rich implements State{
	@Override
	public void saySomething(StateContext sc) {
		System.out.println("I'm rich currently, and play a lot.");
		sc.changeState(new Poor());
	}
}
