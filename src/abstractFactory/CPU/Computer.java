package abstractFactory.CPU;

class Computer {
	CPU cpu;
 
    public Computer(CPUFactory factory) {
    	cpu = factory.produceCPU();
        cpu.process();
    }
}
