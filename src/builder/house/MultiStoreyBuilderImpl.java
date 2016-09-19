package builder.house;

public class MultiStoreyBuilderImpl extends Builder {
	public MultiStoreyBuilderImpl() {
		house = new House();
	}
	@Override
	public House buildHouse() {
		house.buildBase();// ���������
		house.buildFloor();// ��� 1 �����
		Window complexWindow = new ComplexWindow();
		house.buildWalls(complexWindow); // �����
		house.buildFloor(); // ��� ������� �����
		house.setStores(1); // 1 ���� �����
		complexWindow = new ComplexWindow();
		house.buildWalls(complexWindow); // �����
		house.buildRoof(); // �����
		house.setStores(2); // 2 ���� �����
		return house; // ���������� ������� ������
	}
}
