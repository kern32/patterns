package abstractFactory.CPU;

class IntelFactory implements CPUFactory {
    public CPU produceCPU() {
        return new IntelCPU();
    }
}
