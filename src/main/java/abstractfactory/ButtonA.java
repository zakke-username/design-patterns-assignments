package abstractfactory;

public class ButtonA extends Button {
    public void display() {
        // top
        System.out.print("\n+");
        for (int i = 0; i < this.text.length() + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        // text
        System.out.println("| " + this.text + " |");

        // bottom
        System.out.print("+");
        for (int i = 0; i < this.text.length() + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
