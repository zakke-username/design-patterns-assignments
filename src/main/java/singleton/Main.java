package singleton;

public class Main {
    static void main() {
        Logger l = Logger.getInstance();

        l.setFileName("new-log.txt");
        l.write("Hello world");
        l.write("Starting simulation...");
        l.write("Some error occurred");
        l.write("Simulation finished");
        l.close();
    }
}
