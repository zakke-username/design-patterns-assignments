package abstractfactory;

public class Main {
    static void main() {
        UIFactory f = new AFactory();

        Button btn = f.createButton("Click me");
        Checkbox cb = f.createCheckbox("Select me");
        TextField tf = f.createTextField("Name");

        btn.display();
        cb.display();
        tf.display();

        btn.setText("A changed button");
        cb.setText("This checkbox has changed as well");

        btn.display();
        cb.display();
    }
}
