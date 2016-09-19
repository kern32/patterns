package visitor.NY;

public class TestVisitor {
	public static void main(String[] args) {
		FirstTimeVisitor visitor = new FirstTimeVisitor();
		City city = new City();
		city.accept(visitor);
	}
}
