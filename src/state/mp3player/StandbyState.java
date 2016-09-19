package state.mp3player;

public class StandbyState implements State {
	public void pressPlay(MP3PlayerContext context) {
		System.out.println("Stand by state");
		context.setState(new PlayingState());
	}
}
