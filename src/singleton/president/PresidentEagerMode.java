package singleton.president;

public class PresidentEagerMode {
	private static final PresidentEagerMode thePresident = new PresidentEagerMode();
	 
	private PresidentEagerMode() {}
 
	public static PresidentEagerMode getPresident() {
		return thePresident;
	}
}
