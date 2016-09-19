package state.mp3player;

public class Main {
	public static void main(String[] args) {
		MP3PlayerContext ctx = new MP3PlayerContext(new PlayingState()); 
		ctx.play();
		ctx.play();
	}
}