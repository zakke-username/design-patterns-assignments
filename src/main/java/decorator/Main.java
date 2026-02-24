package decorator;

public class Main {
    static void main() {
        Printer p = new BasicPrinter();
        p.print("Hello world");

        Printer p2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        p2.print("This is a test message!");
    }
}
