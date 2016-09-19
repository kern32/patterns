package command.light;

public class TvOnCommand implements Command {
    private TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }
}
