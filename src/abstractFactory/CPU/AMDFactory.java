package abstractFactory.CPU;

class AMDFactory implements CPUFactory {
    public CPU produceCPU() {
        return new AMDCPU();
    }
}