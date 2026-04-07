package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Intel i5"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("8 GB RAM"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("512 GB HDD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Integrated graphics card"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Ubuntu"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
