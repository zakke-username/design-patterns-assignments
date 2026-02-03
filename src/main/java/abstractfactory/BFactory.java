package abstractfactory;

public class BFactory extends UIFactory {
    public Button createButton(String text) {
        Button btn = new ButtonB();
        btn.setText(text.toUpperCase());
        return btn;
    }

    public Checkbox createCheckbox(String text) {
        Checkbox cb = new CheckboxB();
        cb.setText(text.toUpperCase());
        return cb;
    }

    public TextField createTextField(String text) {
        TextField tf = new TextFieldB();
        tf.setText(text.toUpperCase());
        return tf;
    }
}
