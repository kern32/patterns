package command.pc;

import java.util.ArrayList;
import java.util.List;

/* The Invoker class */
class Switch { 
  private List<Command> history = new ArrayList<Command>();

  public Switch() {
  }

  public void storeAndExecute(Command command) {
     this.history.add(command); // optional, can do the execute only!
     command.execute();        
  }
}
