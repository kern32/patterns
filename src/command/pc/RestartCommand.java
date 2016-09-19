package command.pc;

/* The Command for restarting the computer */
class RestartCommand implements Command {
  private Computer computer;

  public RestartCommand(Computer computer) {
     this.computer = computer;
  }

  public void execute() {
     computer.restart();
  }
}
