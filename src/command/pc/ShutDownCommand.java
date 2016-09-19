package command.pc;

/* The Command for shutting down the computer*/
class ShutDownCommand implements Command {
  private Computer computer;

  public ShutDownCommand(Computer computer) {
     this.computer = computer;
  }

  public void execute(){
     computer.shutDown();
  }
}
