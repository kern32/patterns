package command.light;

public class Main {
	public static void main(String[] args){
	      TV tv = new TV();
	      Light light = new Light();
	      
	      Command lightOf = new LightOffCommand(light);
	      Command tvOn = new TvOnCommand(tv);
	      Switch s = new Switch(tvOn, lightOf);
	      s.off();
	      s.on();
	   }
}
