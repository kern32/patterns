package observer.weather;

public interface Observer {
	void update (float temperature, float humidity, int pressure);
}
