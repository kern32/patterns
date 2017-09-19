package command.light;

public class Main {
	public static void main(String[] args){
	      //sender
	      TV tv = new TV();
	      Light light = new Light();
	      
	      //command
	      Command lightOf = new LightOffCommand(light);
	      Command tvOn = new TvOnCommand(tv);
	      
	      //receiver	
	      Switch s = new Switch(tvOn, lightOf);
	      s.off();
	      s.on();
	   }
}
