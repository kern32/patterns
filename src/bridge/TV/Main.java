package bridge.TV;

public class Main {
	public static void main(String[] args) {
		ITV tv = new SonyTV();
		LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
		lrc.setChannelKeyboard(100);
		System.out.println("test");
	}
}
