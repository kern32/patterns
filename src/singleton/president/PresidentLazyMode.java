package singleton.president;

public class PresidentLazyMode {
	private static PresidentLazyMode thePresident;

	private PresidentLazyMode() {
	}

	public static PresidentLazyMode getPresident() {
		if (thePresident == null) {
			thePresident = new PresidentLazyMode();
		}
		return thePresident;
	}
}
