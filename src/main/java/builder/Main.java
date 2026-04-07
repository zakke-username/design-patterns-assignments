package builder;

public class Main {
    static void main() {
        // Gaming PC
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector gamingComputerDirector = new ComputerDirector(gamingComputerBuilder);
        gamingComputerDirector.constructComputer();
        Computer gamingComputer = gamingComputerBuilder.getComputer();
        System.out.println(gamingComputer);

        // Office PC
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officeComputerDirector = new ComputerDirector(officeComputerBuilder);
        officeComputerDirector.constructComputer();
        Computer officeComputer = officeComputerBuilder.getComputer();
        System.out.println(officeComputer);
    }
}
