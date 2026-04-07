package builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("AMD Ryzen 7"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("32 GB RAM"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("1 TB SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Nvidia GeForce RTX 5070"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Windows 11 Pro"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
