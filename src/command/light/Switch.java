package command.light;

public class Switch {
	private Command onCommand;
    private Command offCommand;

    public Switch(Command onCommand, Command offCommand) {
         this.onCommand = onCommand;
         this.offCommand = offCommand;
    }

    public void on() {
         onCommand.execute();
    }

    public void off() {
         offCommand.execute();
    }
}
