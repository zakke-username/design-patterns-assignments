package abstractfactory;

public class TextFieldA extends TextField {
    public void display() {
        // label
        System.out.println("Enter " + this.text + ":");

        // box top
        System.out.print("+");
        for (int i = 0; i < this.text.length() + 16; i++) {
            System.out.print("-");
        }
        System.out.print("+\n");

        // enter text here
        System.out.print("|");
        for (int i = 0; i < this.text.length() + 16; i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        // bottom
        System.out.print("+");
        for (int i = 0; i < this.text.length() + 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
