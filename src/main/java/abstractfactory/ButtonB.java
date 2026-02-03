package abstractfactory;

public class ButtonB extends Button {
    public void display() {
        System.out.println();
        System.out.print("  //");
        for (int i = 0; i < this.text.length() + 2; i++) {
            System.out.print("=");
        }
        System.out.print("//\n");

        System.out.println(" // " + this.text + " //");

        System.out.print("//");
        for (int i = 0; i < this.text.length() + 2; i++) {
            System.out.print("=");
        }
        System.out.print("//\n");
    }
}
