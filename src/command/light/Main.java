package command.light;

public class Main {
	public static void main(String[] args){
	      //receiver
	      TV tv = new TV();
	      Light light = new Light();
	      
	      //command
	      Command lightOf = new LightOffCommand(light);
	      Command tvOn = new TvOnCommand(tv);
	      
	      //sender	
	      Switch s = new Switch(tvOn, lightOf);
	      s.off();
	      s.on();
	   }
}
