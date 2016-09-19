package prototype;

class ConcreteClass implements Prototype, Cloneable {
    private int size;
 
    public ConcreteClass(int x) {
        this.size = x;
    }
 
    @Override
    public void setSize(int x) {
        this.size = x;
    }
 
    @Override
    public void printSize() {
        System.out.println("Size: " + size);
    }
 
 
    @Override
    public ConcreteClass clone() throws CloneNotSupportedException {
        return (ConcreteClass) super.clone();
    }
}
