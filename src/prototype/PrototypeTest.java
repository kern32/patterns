package prototype;

public class PrototypeTest {
    public static void main(String args[]) throws CloneNotSupportedException {
        ConcreteClass a = new ConcreteClass(1);
 
        for (int i = 2; i < 10; i++) {
            Prototype temp = a.clone();
            temp.setSize(i);
            temp.printSize();
        }
    }
}
