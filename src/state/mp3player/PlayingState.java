package state.mp3player;

public class PlayingState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("Playing state");
		context.setState(new StandbyState());
	}
}
