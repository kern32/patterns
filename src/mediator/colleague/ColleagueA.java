package mediator.colleague;

//concrete colleague
class ColleagueA extends Colleague {
	 
	public ColleagueA(IMediator mediator) {
		this.mediator = mediator;
	}
 
	@Override
	public void doSomething() {
		this.mediator.talk();
		this.mediator.registerA(this);
	}
}
