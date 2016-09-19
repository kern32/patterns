package adapter.fruits;

public class AppleAdapter extends Apple {
	private Orange orange;

	public AppleAdapter(Orange orange) {
		this.orange = orange;
	}

	public void getAColor(String str) {
		orange.getOColor(str);
	}
}
